# adventofcode

https://adventofcode.com

My solutions for advent of code, found at the above website.

## Purpose

Familiarize myself more with developing with IntelliJ on macOS as I have been mostly developing using eclipse before, on
both Windows and Linux.

And fun. 🥳

## Skipped Days

### 2020

I've only done these after the fact, so I only have a few days completed.

### 2021

I did this more or less as it happened, and skipped the following days for one reason or another.
I'm deliberately not including tests and code for these days to keep all tests passing.

19, 23, 25 (part 2)

## Some code snippets for my own use

### Helpful when tests could otherwise run for an uncomfortably long amount of time

```
Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), () -> {
            assertEquals(expected, Day18.calculateSum(example));
        });
```
