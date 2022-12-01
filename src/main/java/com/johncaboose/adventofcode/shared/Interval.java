package com.johncaboose.adventofcode.shared;

/**
 * Represents an integer interval, with inclusive start and end values. Assumes that the start value is less than or
 * equal to the end value.
 */
public record Interval(int startInclusive, int endInclusive) {

    /**
     * Constructs an interval with the specified start and end points, both inclusive. Assumes that startInclusive less
     * than or equal to endInclusive.
     *
     * @param startInclusive lowest value contained inside the interval
     * @param endInclusive   highest value contained inside the interval
     */
    public Interval(String startInclusive, String endInclusive) {
        this(Integer.parseInt(startInclusive), Integer.parseInt(endInclusive));
    }

    public Interval(Interval other) {
        this(other.startInclusive, other.endInclusive);
    }

    /**
     * Returns true if this interval contains the specified value. More formally, returns true where (startInclusive >=
     * value <= endInclusive).
     *
     * @param value value to check
     * @return true if specified value is inside this interval, otherwise false
     */
    public boolean contains(int value) {
        return value >= startInclusive && value <= endInclusive;
    }

    /**
     * Returns true if this interval contains any value that specified interval also contains.
     *
     * @param otherInterval the other interval to compare with
     * @return true if any value in otherInterval can also be found inside this interval
     */
    public boolean overlaps(Interval otherInterval) {
        return this.contains(otherInterval.startInclusive) ||
                this.contains(otherInterval.endInclusive) ||
                otherInterval.contains(startInclusive) ||
                otherInterval.contains(endInclusive);
    }

    /**
     * Returns true if this interval only contains values that the specified interval also contains.
     *
     * @param otherInterval the other interval to compare with
     * @return true if this interval only contains values that can also be found in otherInterval
     */
    public boolean completelyInside(Interval otherInterval) {
        return otherInterval.contains(startInclusive) && otherInterval.contains(endInclusive);
    }

    /**
     * Returns a Couple of intervals such that they together contain all elements in this interval, such that only one
     * of them share any values with otherInterval. An exception of type IllegalArgumentException is thrown if there is
     * no overlap between this interval and the specified interval, or if it is not possible to split this interval so
     * the previously described conditions are met.
     *
     * @param otherInterval the other interval to compare with
     * @return the two sub-intervals that make up this interval, where only one of them shares values with otherInterval
     * @throws IllegalArgumentException
     */
    public Couple<Interval, Interval> split(Interval otherInterval) {
        if (completelyInside(otherInterval)) {
            throw new IllegalArgumentException("Nothing to split if completely inside otherInterval");
        }

        if (!this.overlaps(otherInterval)) {
            throw new IllegalArgumentException("Can't split if there is no overlap");
        }

        if (this.contains(otherInterval.startInclusive) && this.startInclusive != otherInterval.startInclusive) {
            int firstEnd = otherInterval.startInclusive - 1;
            int secondStart = firstEnd + 1;
            return new Couple<>(new Interval(startInclusive, firstEnd), new Interval(secondStart, endInclusive));
        }

        if (this.contains(otherInterval.endInclusive)) {
            int firstEnd = otherInterval.endInclusive;
            int secondStart = firstEnd + 1;
            return new Couple<>(new Interval(startInclusive, firstEnd), new Interval(secondStart, endInclusive));
        }

        throw new IllegalArgumentException("Couldn't find where to split for some unknown reason");

    }

    /**
     * @return the amount of values contained in the interval
     */
    public long size() {
        return endInclusive - startInclusive + 1;
    }

    /**
     * @param clampInterval the interval that shall be used as limits for the clamping
     * @return the sub-interval of this interval that completely fits inside clampInterval
     * @throws IllegalArgumentException
     */
    public Interval clamped(Interval clampInterval) {
        if (!this.overlaps(clampInterval)) {
            throw new IllegalArgumentException("Interval completely outside clampInterval.");
        }
        return new Interval(Math.max(clampInterval.startInclusive, this.startInclusive),
                Math.min(clampInterval.endInclusive, this.endInclusive));
    }

    @Override
    public String toString() {
        return startInclusive + ".." + endInclusive;
    }
}
