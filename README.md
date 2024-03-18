# PrimeChecker

## Overview
The PrimeChecker is a Java application designed to determine whether a given number is prime. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. This application not only checks for prime numbers in a straightforward manner but also utilizes concurrent programming concepts by splitting the task across multiple threads to enhance performance.

## Features
- Checks if a given number is prime.
- Utilizes multithreading to divide the workload and improve the checking efficiency.
- Demonstrates basic concurrent programming techniques in Java.

## How to Run
To run this application, you need to have Java installed on your machine. Follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory in your terminal or command prompt.
3. Compile the Java program using the command: `javac PrimeChecker.java`.
4. Run the program with the command: `java PrimeChecker`.

## Example Usage
```java
// To check if a specific number is prime
int numberToCheck = 29;
PrimeChecker.checkPrime(numberToCheck);
```

## License
This project is shared for educational purposes. Feel free to use it for learning or teaching about concurrency in Java.
