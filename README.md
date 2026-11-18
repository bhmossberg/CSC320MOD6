# CSC320MOD6 – Methods

zyLabs-style Java programs that move logic into reusable `static` methods with parameters and return values.

## Overview

This is **CSU Global CSC320 (Programming I), Module 6** practice work. It is an Eclipse Java project. Every file in `src/` is a standalone program in the default package: a `main` that reads input with `Scanner` and calls one or more helper methods.

## Programs (`src/`)

| File | Method(s) | What it does |
|------|-----------|--------------|
| `AcronymMaker.java` | `createAcronym(String)` | Builds an acronym from the uppercase letters of a phrase. For example, `Institute of Electrical and Electronics Engineers` → `IEEE`. |
| `AlphaOnly.java` | `removeNonAlpha(String)` | Returns only the letters of the input, using `Character.isLetter`. |
| `ChangeMaker.java` | `exactChange(int, int[])` | The Module 3 change maker rewritten as a method. It fills an `int[5]` array (dollars, quarters, dimes, nickels, pennies), which shows that **arrays are passed by reference**, then prints the counts with singular and plural labels. |
| `ClassExperiments.java` | `print(String)`, `println(String)` | Wrapper methods around `System.out`. The program reads an integer, prints its cube and square using `Math.pow`, then echoes a string. It also shows the `nextInt()`/`nextLine()` newline pitfall. |
| `ConvertToBinary.java` | `intToReverseBinary(int)`, `stringReverse(String)` | Converts a positive integer to binary by repeated `% 2` and `/ 2`, then reverses the digit string. For example, `19` → `10011`. |
| `CountCharacters.java` | `countCharacters(char, String)` | Counts how many times a character appears in the rest of the input line. |
| `DrivingCost.java` | `drivingCost(miles, mpg, dollarsPerGallon)` | Prints the cost of driving 10, 50 and 400 miles. For example, `20.0 3.1599` → `1.58 7.90 63.20`. |
| `FlipACoin.java` | `headsOrTails(Random)` | Simulates *n* coin flips with a seeded `Random(2)`, so the results are repeatable. |
| `Jiffy.java` | `secondsToJiffies(double)` | Converts seconds to jiffies (× 100). |
| `LeapYear.java` | `isLeapYear(int)` | The Gregorian leap-year rule returned as a `boolean`. |
| `MaxAndMinNums.java` | `largestNumber(...)`, `smallestNumber(...)` | Finds the largest and smallest of three ints. Each method **throws an `Exception`** ("All numbers equal") when all three are equal, and `main` catches it. |
| `MaxMagnitude.java` | `maxMagnitude(int, int)` | Returns whichever value has the larger absolute value, and prints a note when the two are equal. |
| `MilesToTrack.java` | `milesToLaps(double)` | Converts miles to track laps (× 4). |
| `StepCounter.java` | `stepsToMiles(int)` | Converts steps to miles (÷ 2000). |
| `SwappingVariables.java` | `swapValues(int[])` | Reverses a 4-element array **in place**: it swaps each element in the first half with its mirror using a temp variable, then prints the result. For example, `8 2 4 6` → `6 4 2 8`. |

## Build and run

JDK 8 or newer. Compile and run any program on its own:

```bash
cd src
javac SwappingVariables.java
echo "8 2 4 6" | java SwappingVariables      # 6 4 2 8
echo 19 | java ConvertToBinary            # 10011
```

## Concepts demonstrated
- Defining `public static` methods with parameters and return types (`String`, `int`, `double`, `boolean`, `void`)
- Passing arrays to methods and changing them in place
- Throwing and catching exceptions from a method
- Separating calculation (the method) from I/O (`main`)
- Using `Math.pow`, `Math.abs`, `Character.isLetter` and `Random` with a seed
