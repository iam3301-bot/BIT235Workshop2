# BIT235 Workshop 2

Standalone Java solutions for **Fundamental Programming Structures in Java: Variables, Primitive Datatypes and String**. Each public class matches its filename and has its own `main` method. There are no packages or external dependencies.

## Compile and run

Install a Java Development Kit (JDK 8 or later), open a terminal in this directory, and compile all eight programs:

```sh
javac *.java
java Exercise11
```

Enter the values requested by the program. For example, enter `15` and then `6` for Exercise 1.1; the result is `Difference: 9`. To run another exercise, use its class name:

```sh
java Exercise12
java Exercise13
java Exercise14
java Exercise15
java Exercise16
java Exercise17
java Exercise18
```

Use a dot as the decimal separator, for example `2.5`. Exercises 1.4-1.7 use the fixed values from the worksheet and do not request input. Compiled `.class` files are ignored by Git.

## Exercise mapping and expected results

| Exercise | Source | Input / calculation | Expected result |
| --- | --- | --- | --- |
| 1.1 | `Exercise11.java` | First integer `15`, second integer `6` | `Difference: 9` |
| 1.2 | `Exercise12.java` | Celsius `37` | `Fahrenheit: 98.60` |
| 1.3 | `Exercise13.java` | Radius `1`, `2.5`, or `5` in separate runs | Circle area `3.14`, `19.63`, or `78.50` |
| 1.4 | `Exercise14.java` | $5000, annual rate 0.04, 10 years | `Amount after 10 years: $7401.22` |
| 1.5 | `Exercise15.java` | Earth diameter 7600 mi; Sun diameter 865000 mi | Earth `2.297308e+11` cubic miles; Sun `3.387090e+17` cubic miles; ratio `1474373.60` |
| 1.6 | `Exercise16.java` | 40 L tank; normal 8 L/100 km; rough 9.2 L/100 km | Normal road `500.00 km`; rough road `434.78 km` |
| 1.7 | `Exercise17.java` | `"I love java programming".substring(7, 11)` | Returned string `"java"`; length `4` |
| 1.8 | `Exercise18.java` | `Java` and `Java` | Strings equal `True`; first characters equal `True` |

## Calculation and input notes

- The difference is the first integer minus the second. Both inputs are `int`; casting before subtraction stores the full result in a `long`, including extreme input values.
- Celsius and radius inputs use `double`. A negative radius is rejected. The circle and sphere calculations use **pi = 3.14**, as required, and `Math.pow` supplies the square or cube.
- Sphere calculations use half the given diameter as the radius and `4.0 / 3.0` to avoid integer division. The ratio is Sun volume divided by Earth volume. Scientific notation displays the very large volumes clearly.
- Compound interest uses the decimal rate `0.04`. The displayed amount includes the original principal.
- Rough roads use 15% more fuel: `8 * 1.15 = 9.2` L/100 km. Their range is `40 / 9.2 * 100`, or approximately 434.78 km.
- `substring(7, 11)` includes indexes 7 through 10; its end index is excluded.
- String comparison is case-sensitive. `nextLine` preserves spaces, `equals` compares full contents, and `charAt(0)` compares the first characters only when both strings are nonempty. Two empty strings are equal, but their first characters cannot be compared.

### Additional string examples

| First string | Second string | Strings equal | First characters equal |
| --- | --- | --- | --- |
| `Java` | `Javascript` | `False` | `True` |
| `Java` | `java` | `False` | `False` |
| `Java programming` | `Java programming` | `True` | `True` |
| Empty | Empty | `True` | Cannot compare |
| Empty | `Java` | `False` | Cannot compare |
