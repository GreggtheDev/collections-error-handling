# Integer Operations Project

This project demonstrates various operations on a list of integers, including removing duplicates, calculating the sum and average, printing the results, and handling exceptions. The operations are implemented in Java.

## Features

- **Creating and Adding Integers to the List**: Initializes a list of integers with some duplicate values.
- **Removing Duplicates Using Set**: Uses a `Set` to remove duplicates from the list.
- **Calculating the Sum and Average of the Integers**: Computes the sum and average of the unique integers.
- **Printing the Results**: Displays the list of unique integers, the sum, and the average.
- **Handling Exceptions**: Implements exception handling using try-catch-finally and multi-catch blocks.

## Code Overview

### Main Class: `IntegerOperations`

The main class, `IntegerOperations`, performs the following steps:

1. **Initialize the List**: Creates a list of integers with duplicates.
    ```java
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 9, 10, 5);
    ```

2. **Remove Duplicates**: Uses a `HashSet` to remove duplicates from the list.
    ```java
    Set<Integer> integerSet = new HashSet<>(integerList);
    ```

3. **Calculate Sum and Average**: Computes the sum and average of the unique integers, handling potential division by zero.
    ```java
    int sum = 0;
    double average = 0.0;
    try {
        for (int num : integerSet) {
            sum += num;
        }
        if (integerSet.size() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        average = (double) sum / integerSet.size();
    } catch (ArithmeticException e) {
        System.out.println("Error calculating average: " + e.getMessage());
    }
    ```

4. **Print Results**: Displays the list of unique integers, the sum, and the average.
    ```java
    System.out.println("List of integers without duplicates: " + integerSet);
    System.out.println("Sum of integers: " + sum);
    System.out.println("Average of integers: " + average);
    ```

5. **Exception Handling**: Demonstrates handling exceptions using try-catch-finally and multi-catch blocks.
    ```java
    try {
        System.out.println("Accessing an element at index 100: " + integerList.get(100));
    } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
        System.out.println("Exception caught: " + e.getMessage());
    } finally {
        System.out.println("Execution completed in the finally block.");
    }
    ```

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Clone the repository:
    ```sh
    git clone (https://github.com/GreggtheDev/collections-error-handling.git)
    ```

2. Navigate to the project directory:
    ```sh
    cd integer-operations
    ```

3. Compile the Java file:
    ```sh
    javac -d bin src/org/example/IntegerOperations.java
    ```

4. Run the compiled Java program:
    ```sh
    java -cp bin org.example.IntegerOperations
    ```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Acknowledgments

- Java Documentation: [https://docs.oracle.com/en/java/](https://docs.oracle.com/en/java/)
