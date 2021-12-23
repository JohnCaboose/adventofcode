package com.johncaboose.adventofcode.twentytwentyone.days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day16 implements ISolvableDay {
    private static final int PACKET_VERSION_LENGTH = 3;
    private static final int TYPE_ID_LENGTH = 3;
    private static final int HEADER_LENGTH = PACKET_VERSION_LENGTH + TYPE_ID_LENGTH;

    private static final int GROUP_PREFIX_LENGTH = 1;
    private static final int GROUP_CONTENT_LENGTH = 4;
    private static final int GROUP_LENGTH = GROUP_PREFIX_LENGTH + GROUP_CONTENT_LENGTH;

    private static final int LITERAL_VALUE_TYPE_ID = 4;


    @Override
    public long partOneSolver(String input) {
        String binaryString = binaryString(input);

        Cursor cursor = new Cursor();

        Packet topLevelPacket = readPacket(binaryString, cursor);

        return topLevelPacket.sumOfPacketAndSubPacketVersions();
    }

    @Override
    public long partTwoSolver(String input) {
        String binaryString = binaryString(input);

        Cursor cursor = new Cursor();

        Packet topLevelPacket = readPacket(binaryString, cursor);

        return topLevelPacket.result();
    }

    private Packet readPacket(String binaryString, Cursor cursor) {
        int packetVersion = readInteger(binaryString, cursor, PACKET_VERSION_LENGTH);
        int typeId = readInteger(binaryString, cursor, TYPE_ID_LENGTH);


        Packet packet = typeId == LITERAL_VALUE_TYPE_ID ?
                readLiteralValuePacket(packetVersion, typeId, binaryString, cursor) :
                readOperatorPacket(packetVersion, typeId, binaryString, cursor);

        return packet;
    }

    private Packet readOperatorPacket(int packetVersion, int typeId, String binaryString, Cursor cursor) {
        List<Packet> subPackets = new ArrayList<>();
        String lengthTypeId = readBitString(binaryString, cursor, 1);
        if (lengthTypeId.equals("0")) {
            int lengthOfAllSubPackets = readInteger(binaryString, cursor, 15);
            int limit = cursor.getCurrentPosition() + lengthOfAllSubPackets;
            while (cursor.getCurrentPosition() < limit) {
                subPackets.add(readPacket(binaryString, cursor));
            }

        } else {
            int amountOfImmediateSubPackets = readInteger(binaryString, cursor, 11);
            for (int i = 0; i < amountOfImmediateSubPackets; i++) {
                subPackets.add(readPacket(binaryString, cursor));
            }

        }
        Packet packet = new Packet(packetVersion, typeId, subPackets);
        return packet;
    }

    private Packet readLiteralValuePacket(int packetVersion, int typeId, String binaryString, Cursor cursor) {
        String binaryLiteral = "";
        while (true) {
            String bit = readBitString(binaryString, cursor, GROUP_PREFIX_LENGTH);
            binaryLiteral += readBitString(binaryString, cursor, GROUP_CONTENT_LENGTH);
            if (bit.equals("0")) {
                break;
            }
        }
        long literalValue = Long.parseLong(binaryLiteral, 2);
        Packet packet = new Packet(packetVersion, typeId, literalValue);
        return packet;
    }


    private record Packet(int packetVersion, int typeId, List<Packet> subPackets, long literalValue) {
        private static final int SUM_TYPE_ID = 0;
        private static final int PRODUCT_TYPE_ID = 1;
        private static final int MINIMUM_TYPE_ID = 2;
        private static final int MAXIMUM_TYPE_ID = 3;
        private static final int GREATER_THAN_TYPE_ID = 5;
        private static final int LESS_THAN_TYPE_ID = 6;
        private static final int EQUAL_TO_TYPE_ID = 7;


        public Packet(int packetVersion, int typeId, long literalValue) {
            this(packetVersion, typeId, List.of(), literalValue);
        }

        public Packet(int packetVersion, int typeId, List<Packet> subPackets) {
            this(packetVersion, typeId, subPackets, 0L);
        }

        public int sumOfPacketAndSubPacketVersions() {
            int subPacketsVersionSum = subPackets.stream()
                    .mapToInt(Packet::sumOfPacketAndSubPacketVersions)
                    .sum();
            return packetVersion + subPacketsVersionSum;
        }

        public long result() {
            long result = switch (typeId) {
                case SUM_TYPE_ID -> subPackets.stream().mapToLong(Packet::result).sum();
                case PRODUCT_TYPE_ID -> subPackets.stream().mapToLong(Packet::result).reduce(Math::multiplyExact).getAsLong();
                case MINIMUM_TYPE_ID -> subPackets.stream().mapToLong(Packet::result).min().getAsLong();
                case MAXIMUM_TYPE_ID -> subPackets.stream().mapToLong(Packet::result).max().getAsLong();
                case GREATER_THAN_TYPE_ID -> subPackets.get(0).result() > subPackets.get(1).result() ? 1 : 0;
                case LESS_THAN_TYPE_ID -> subPackets.get(0).result() < subPackets.get(1).result() ? 1 : 0;
                case EQUAL_TO_TYPE_ID -> subPackets.get(0).result() == subPackets.get(1).result() ? 1 : 0;
                case LITERAL_VALUE_TYPE_ID -> literalValue;
                default -> 0L;
            };

            return result;
        }


    }

    private static String readBitString(String packet, Cursor cursor, int bitsToRead) {
        return packet.substring(cursor.getCurrentPosition(), cursor.moveAndReturn(bitsToRead));
    }

    private static int readInteger(String packet, Cursor cursor, int bitsToRead) {
        return Integer.parseInt(readBitString(packet, cursor, bitsToRead), 2);
    }

    private static class Cursor {
        private int currentPosition = 0;

        public int getCurrentPosition() {
            return currentPosition;
        }

        public int moveAndReturn(int stepsToMoveForward) {
            currentPosition += stepsToMoveForward;
            return getCurrentPosition();
        }
    }

    private static String binaryString(String input) {
        try (Scanner scanner = new Scanner(input)) {
            String hex = scanner.nextLine();
            String binary = hexToBin(hex);
            return binary;
        }
    }

    private static String hexToBin(String hex) {
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }
}
