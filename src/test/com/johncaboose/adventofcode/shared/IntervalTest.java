package com.johncaboose.adventofcode.shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntervalTest {

    @Test
    public void interval_WHEN_argumentsAreStringsOfNegativeNumbers_THEN_constructsCorrectInterval() {
        Interval sut = new Interval("-7", "-3");
        Interval expected = new Interval(-7, -3);

        assertEquals(expected, sut);
    }

    @Test
    public void interval_WHEN_argumentsAreStringsOfPositiveNumbers_THEN_constructsCorrectInterval() {
        Interval sut = new Interval("3", "7");
        Interval expected = new Interval(3, 7);

        assertEquals(expected, sut);
    }

    @Test
    public void size_WHEN_positiveStartEnd_THEN_returnsCorrectSize() {
        int expectedSize = 5;
        Interval sut = new Interval(3, 7);

        assertEquals(expectedSize, sut.size());
    }

    @Test
    public void size_WHEN_negativeStartPositiveEnd_THEN_returnsCorrectSize() {
        int expectedSize = 11;
        Interval sut = new Interval(-7, 3);

        assertEquals(expectedSize, sut.size());
    }

    @Test
    public void size_WHEN_negativeStartEnd_THEN_returnsCorrectSize() {
        int expectedSize = 5;
        Interval sut = new Interval(-7, -3);

        assertEquals(expectedSize, sut.size());
    }

    @Test
    public void size_WHEN_sameStartEnd_THEN_returnsCorrectSize() {
        int expectedSize = 1;
        Interval sut = new Interval(13, 13);

        assertEquals(expectedSize, sut.size());
    }

    @Test
    public void contains_WHEN_valueInsideIntervalOfSizeOne_THEN_returnsTrue() {
        boolean expected = true;
        int input = 13;
        Interval sut = new Interval(13, 13);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void contains_WHEN_valueSameAsStart_THEN_returnsTrue() {
        boolean expected = true;
        int input = 13;
        Interval sut = new Interval(13, 20);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void contains_WHEN_valueSameAsEnd_THEN_returnsTrue() {
        boolean expected = true;
        int input = 20;
        Interval sut = new Interval(13, 20);

        assertEquals(expected, sut.contains(input));
    }


    @Test
    public void contains_WHEN_valueSameAsStart_AND_negative_THEN_returnsTrue() {
        boolean expected = true;
        int input = -13;
        Interval sut = new Interval(-13, -1);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void contains_WHEN_valueSameAsEnd_AND_negative_THEN_returnsTrue() {
        boolean expected = true;
        int input = -20;
        Interval sut = new Interval(-100, -20);

        assertEquals(expected, sut.contains(input));
    }


    @Test
    public void contains_WHEN_valueBeforeStart_THEN_returnsFalse() {
        boolean expected = false;
        int input = 13;
        Interval sut = new Interval(14, 20);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void contains_WHEN_valueAfterEnd_THEN_returnsFalse() {
        boolean expected = false;
        int input = 21;
        Interval sut = new Interval(13, 20);

        assertEquals(expected, sut.contains(input));
    }


    @Test
    public void contains_WHEN_valueBeforeStart_AND_negative_THEN_returnsFalse() {
        boolean expected = false;
        int input = -13;
        Interval sut = new Interval(-12, -1);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void contains_WHEN_valueAfterEnd_AND_negative_THEN_returnsFalse() {
        boolean expected = false;
        int input = -19;
        Interval sut = new Interval(-100, -20);

        assertEquals(expected, sut.contains(input));
    }

    @Test
    public void overlaps_WHEN_otherIntervalAfter_THEN_returnsFalse() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(21, 30);
        assertFalse(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalBefore_THEN_returnsFalse() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(0, 9);
        assertFalse(sut.overlaps(other));
    }


    @Test
    public void overlaps_WHEN_otherIntervalSame_THEN_returnsTrue() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(10, 20);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalInsideButDifferentStartEnd_THEN_returnsTrue() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(11, 19);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalOverlapsStartOnly_THEN_returnsTrue() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(0, 10);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalOverlapsEndOnly_THEN_returnsTrue() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(20, 30);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalOverlapsStartOnly_AND_negative_THEN_returnsTrue() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-25, -20);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void overlaps_WHEN_otherIntervalOverlapsEndOnly_AND_negative_THEN_returnsTrue() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-10, -1);
        assertTrue(sut.overlaps(other));
    }

    @Test
    public void completelyInside_WHEN_same_THEN_returnsTrue() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(10, 20);
        assertTrue(sut.completelyInside(other));

    }

    @Test
    public void completelyInside_WHEN_same_AND_negative_THEN_returnsTrue() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-20, -10);
        assertTrue(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_insideWithDifferentStartEnd_THEN_returnsTrue() {
        Interval sut = new Interval(11, 19);
        Interval other = new Interval(10, 20);
        assertTrue(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideStart_THEN_returnsFalse() {
        Interval sut = new Interval(9, 20);
        Interval other = new Interval(10, 20);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideEnd_THEN_returnsFalse() {
        Interval sut = new Interval(10, 21);
        Interval other = new Interval(10, 20);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideStartEnd_THEN_returnsFalse() {
        Interval sut = new Interval(9, 21);
        Interval other = new Interval(10, 20);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideStart_AND_negative_THEN_returnsFalse() {
        Interval sut = new Interval(-21, -10);
        Interval other = new Interval(-20, -10);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideEnd_AND_negative_THEN_returnsFalse() {
        Interval sut = new Interval(-20, -9);
        Interval other = new Interval(-20, -10);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void completelyInside_WHEN_outsideStartEnd_AND_negative_THEN_returnsFalse() {
        Interval sut = new Interval(-21, -9);
        Interval other = new Interval(-20, -10);
        assertFalse(sut.completelyInside(other));
    }

    @Test
    public void clamped_WHEN_outsideStart_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(10, 20);
        Interval clamp = new Interval(15, 30);
        Interval expected = new Interval(15, 20);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void clamped_WHEN_outsideEND_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(20, 40);
        Interval clamp = new Interval(15, 30);
        Interval expected = new Interval(20, 30);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void clamped_WHEN_outsideStart_AND_negative_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(-30, -20);
        Interval clamp = new Interval(-20, -5);
        Interval expected = new Interval(-20, -20);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void clamped_WHEN_outsideEND_AND_negative_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(-15, -1);
        Interval clamp = new Interval(-20, -5);
        Interval expected = new Interval(-15, -5);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void clamped_WHEN_envelopsClamp_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(10, 40);
        Interval clamp = new Interval(15, 30);
        Interval expected = new Interval(clamp);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void clamped_WHEN_envelopsClamp_AND_negative_THEN_returnsCorrectInterval() {
        Interval sut = new Interval(-10, -5);
        Interval clamp = new Interval(-7, -6);
        Interval expected = new Interval(clamp);
        assertEquals(expected, sut.clamped(clamp));
    }

    @Test
    public void split_WHEN_beforeOther_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(21, 30);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");

    }

    @Test
    public void split_WHEN_afterOther_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(1, 9);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    public void split_WHEN_completelyInsideOther_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(9, 21);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    public void split_WHEN_shouldSplitOnThisStart_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(0, 10);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(10, 10), new Interval(11, 20));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnOtherStart_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(15, 30);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(10, 14), new Interval(15, 20));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnThisEnd_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(20, 30);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(10, 19), new Interval(20, 20));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnOtherEnd_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(5, 15);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(10, 15), new Interval(16, 20));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_beforeOther_AND_negative_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-9, -1);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    public void split_WHEN_afterOther_AND_negative_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-40, -21);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    public void split_WHEN_completelyInsideOther_AND_negative_THEN_throwsIllegalArgumentException() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(10, 20);
        try {
            sut.split(other);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail("Exception not thrown");
    }

    @Test
    public void split_WHEN_shouldSplitOnThisStart_AND_negative_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-30, -20);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-20, -20), new Interval(-19, -10));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnOtherStart_AND_negative_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-15, -5);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-20, -16), new Interval(-15, -10));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnThisEnd_AND_negative_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-10, -5);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-20, -11), new Interval(-10, -10));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_shouldSplitOnOtherEnd_AND_negative_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-30, -15);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-20, -15), new Interval(-14, -10));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_previouslyProblematicCase_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-22, -19);
        Interval other = new Interval(-19, 26);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-22, -20), new Interval(-19, -19));
        assertEquals(expected, sut.split(other));
    }

    @Test
    public void split_WHEN_couldSplitOnOtherStartOrEnd_AND_runTwice_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(10, 20);
        Interval other = new Interval(12, 15);
        Interval intervalToContinueSplitting = new Interval(12, 20);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(10, 11), intervalToContinueSplitting);
        assertEquals(expected, sut.split(other));


        expected = new Couple<>(new Interval(12, 15), new Interval(16, 20));
        assertEquals(expected, intervalToContinueSplitting.split(other));
    }

    @Test
    public void split_WHEN_couldSplitOnOtherStartOrEnd_AND_negative_AND_runTwice_THEN_returnsCorrectIntervals() {
        Interval sut = new Interval(-20, -10);
        Interval other = new Interval(-15, -12);
        Interval intervalToContinueSplitting = new Interval(-15, -10);
        Couple<Interval, Interval> expected = new Couple<>(new Interval(-20, -16), intervalToContinueSplitting);
        assertEquals(expected, sut.split(other));


        expected = new Couple<>(new Interval(-15, -12), new Interval(-11, -10));
        assertEquals(expected, intervalToContinueSplitting.split(other));
    }


}
