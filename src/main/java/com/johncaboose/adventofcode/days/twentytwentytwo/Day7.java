package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day7 implements ISolvableDay<Long> {

    private static final long MAX_SIZE_TO_INCLUDE = 100000;
    private static final long TOTAL_DRIVE_SIZE = 70000000;
    private static final long REQUIRED_FREE_SPACE = 30000000;

    @Override
    public Long partOneSolver(String input) {
        List<Folder> allFolders = parseDriveContents(input);

        return allFolders.stream()
                .mapToLong(Folder::size)
                .filter(l -> l <= MAX_SIZE_TO_INCLUDE)
                .sum();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Folder> allFolders = parseDriveContents(input);

        Folder origin = allFolders.get(0);
        long usedSpace = origin.size();
        long availableSpace = TOTAL_DRIVE_SIZE - usedSpace;

        if (REQUIRED_FREE_SPACE < availableSpace) {
            return 0L;
        }

        long minimumSpaceToClear = REQUIRED_FREE_SPACE - availableSpace;

        return allFolders.stream()
                .mapToLong(Folder::size)
                .filter(size -> size >= minimumSpaceToClear)
                .min()
                .orElseThrow();
    }

    private static List<Folder> parseDriveContents(String input) {
        // Not robust in the least, but good enough for the purpose...

        Scanner scanner = new Scanner(input);
        // First line is always $ cd / so we can ignore it
        scanner.nextLine();

        List<Folder> allFoundFolders = new ArrayList<>();
        Folder currentFolder = new Folder("/");
        allFoundFolders.add(currentFolder);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("$ ls")) {
                // NOP
            } else if (line.startsWith("$ cd ")) {
                currentFolder = parseCdCommand(currentFolder, line);
            } else {
                parseLsOutput(currentFolder, line, allFoundFolders);
            }
        }

        return allFoundFolders;
    }

    private static Folder parseCdCommand(Folder currentFolder, String line) {
        String[] split = line.split(" ", 3);
        String name = split[2];
        currentFolder = "..".equals(name) ? currentFolder.parentFolder : currentFolder.getContainedFolder(name);
        return currentFolder;
    }

    private static void parseLsOutput(Folder currentFolder, String line, List<Folder> allFoundFolders) {
        if (line.startsWith("dir ")) {
            // Is a folder, example line: "dir a"
            String name = line.substring(4);
            Folder folder = new Folder(name, currentFolder);
            currentFolder.addContent(folder);
            allFoundFolders.add(folder);
        } else {
            // Is a file, example line "14848514 b.txt"
            String[] split = line.split(" ");
            long size = Long.parseLong(split[0]);
            currentFolder.addContent(new File(size));
        }
    }

    private interface DriveContent {
        long size();

    }

    private record File(long size) implements DriveContent {

    }

    private static class Folder implements DriveContent {

        private final String name;
        private final List<DriveContent> allContent = new ArrayList<>();
        private final Map<String, Folder> containedFolders = new HashMap<>();

        private Long calculatedSize = null;

        private final Folder parentFolder;

        public Folder(String name) {
            this(name, null);
        }

        public Folder(String name, Folder parentFolder) {
            this.name = name;
            this.parentFolder = parentFolder;
        }

        public void addContent(DriveContent content) {
            allContent.add(content);
            if (content instanceof Folder folder) {
                containedFolders.put(folder.name, folder);
            }
        }

        public Folder getContainedFolder(String name) {
            Folder folder = containedFolders.get(name);
            if (folder == null) {
                throw new IllegalArgumentException("Folder does not exist");
            }
            return folder;
        }

        @Override
        public long size() {
            // File system does not change, so we can save the size for performance reasons
            if (calculatedSize == null) {
                calculatedSize = allContent.stream()
                        .mapToLong(DriveContent::size)
                        .sum();
            }
            return calculatedSize;
        }

    }


}
