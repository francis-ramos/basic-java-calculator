# Basic Java Calculator

A simple command-line calculator written in **Java**, using **JDK 27**.

The calculator provides a menu-driven interface and supports the four basic arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division

It also provides an option to exit the program.

## Features

* Simple command-line interface
* Menu-based operation selection
* Supports selecting operations by **name** or **number**
* Addition of two integers
* Subtraction of two integers
* Multiplication of two integers
* Division of two integers
* Handles division by zero by displaying `Undefined`
* Clears the terminal between operations
* Small delay after displaying results for improved readability

## Requirements

* **Java Development Kit (JDK) 27**
* A terminal or command prompt

You can verify your installed Java version with:

```bash
java --version
```

You should see a version corresponding to JDK 27.

## Project Structure

A minimal project structure can look like this:

```text
basic-java-calculator/
├── src/
│   └── com/
│       └── ramos/
│           └── Main.java
└── README.md
```

The main class is located at:

```text
src/com/ramos/Main.java
```

and uses the package:

```java
package com.ramos;
```

## How to Run

### 1. Clone the repository

```bash
git clone <repository-url>
cd basic-java-calculator
```

### 2. Compile the program

From the project root:

```bash
javac -d out src/com/ramos/Main.java
```

### 3. Run the program

```bash
java -cp out com.ramos.Main
```

## Usage

When the program starts, it displays the available operations:

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

What do you want to do?
```

You can select an operation using either its **number** or its **name**.

For example:

```text
What do you want to do? 1
```

or:

```text
What do you want to do? addition
```

Both selections perform addition.

### Addition

Example:

```text
Enter a auguend: 10
Enter a addend: 5

10 + 5 = 15
The sum is 15
```

### Subtraction

Example:

```text
Enter a minuend: 10
Enter a subtrahend: 5

10 - 5 = 5
The difference is 5
```

### Multiplication

Example:

```text
Enter a multiplicand: 10
Enter a multiplier: 5

10 * 5 = 50
The product is 50
```

### Division

Example:

```text
Enter a dividend: 10
Enter a divisor: 5

10 / 5 = 2
The quotient is 2
```

Division by zero is handled by displaying:

```text
10 / 0 = Undefined
The quotient is Undefined
```

### Exiting

The program can be exited by entering either:

```text
5
```

or:

```text
exit
```

The program then displays:

```text
Thanks.
```

## Supported Input

| Operation      | Number | Name             |
| -------------- | -----: | ---------------- |
| Addition       |    `1` | `addition`       |
| Subtraction    |    `2` | `subtraction`    |
| Multiplication |    `3` | `multiplication` |
| Division       |    `4` | `division`       |
| Exit           |    `5` | `exit`           |

Operation names are case-insensitive. For example:

```text
Addition
ADDITION
addition
```

all select the Addition operation.

## Implementation Details

The calculator uses Java's `Scanner` class to receive input from the user:

```java
Scanner scan = new Scanner(System.in);
```

The menu is stored in a `String` array:

```java
public static String[] options =
{
    "Addition",
    "Subtraction",
    "Multiplication",
    "Division",
    "Exit",
};
```

The selected operation is handled using a Java `switch` expression with arrow labels:

```java
switch (selected.toLowerCase())
{
    case "addition"       -> addition();
    case "subtraction"    -> subtraction();
    case "multiplication" -> multiplication();
    case "division"       -> division();

    case "1"              -> addition();
    case "2"              -> subtraction();
    case "3"              -> multiplication();
    case "4"              -> division();

    case "exit"           -> end();
    case "5"              -> end();
    default               -> error();
}
```

Each arithmetic operation has its own method:

```text
addition()
subtraction()
multiplication()
division()
```

The program continues running until the `stop` variable is set to `true`.

## Arithmetic

The calculator currently operates on Java `int` values.

Therefore, calculations use integer arithmetic.

For example:

```text
10 / 3 = 3
```

rather than:

```text
10 / 3 = 3.333...
```

This is because both operands are integers.

## Error Handling

The calculator currently uses `try-catch` blocks around arithmetic input.

Invalid numeric input is caught by the program, although the current implementation intentionally leaves the exception handling empty:

```java
catch (Exception e)
{
    // default
}
```

Invalid menu selections are handled separately and display:

```text
Invalid.
```

## Terminal Clearing

The program attempts to clear the terminal using ANSI escape sequences:

```java
System.out.print("\033[H\033[2J");
System.out.flush();
```

Terminal support for ANSI escape sequences may vary depending on the operating system and terminal emulator.

## Author

**Francis Enrico G. Ramos**

## License

This project does not currently specify a license.
If you intend to make the project publicly available, consider adding an appropriate open-source license.
