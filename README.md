# DSA in Java

A beginner-friendly Java repository for practicing Data Structures and Algorithms (DSA). This project is organized as a clean, reusable Java library with examples and tests, while keeping the original problem-solving files from earlier practice work intact.

## Why this repo?

This repository is designed for:

- learning and practicing DSA in Java
- understanding common data structures and algorithms
- writing clean, readable Java code
- using a consistent project layout
- building confidence with examples and tests

## Topics covered

- Arrays
- Linked Lists
- Stacks
- Queues
- Trees
- Graph basics
- Searching
- Sorting
- Binary Search
- Bit Manipulation
- String problems

## Project structure

```text
.
├── Arrays/
├── BinarySearch/
├── BinaryTree/
├── Bit_Manipulation/
├── LinkedList/
├── Stacks/
├── String/
├── docs/
├── src/
│   ├── main/java/com/abhishekkushwaha491/dsa/
│   │   ├── array/
│   │   ├── examples/
│   │   ├── linkedlist/
│   │   ├── stack/
│   │   └── tree/
│   └── test/java/com/abhishekkushwaha491/dsa/
├── .gitignore
├── CONTRIBUTING.md
├── LICENSE
├── README.md
├── pom.xml
└── .github/
```

## Getting started

### Prerequisites

- Java 17 or later
- Maven 3.8+

### Clone the repository

```bash
git clone https://github.com/abhishekkushwaha491/dsa-java.git
cd dsa-java
```

### Build the project

```bash
mvn clean compile
```

### Run tests

```bash
mvn test
```

### Run a sample example

```bash
mvn exec:java -Dexec.mainClass="com.abhishekkushwaha491.dsa.examples.DsaExamples"
```

## Example usage

```java
import com.abhishekkushwaha491.dsa.stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
```

## Data structures included

- `ArrayUtils` for array operations
- `SinglyLinkedList` for linked list practice
- `ArrayStack` for stack operations
- `BinaryTree` for tree traversal and insertion

## Important note

The repository originally contained many topic-based practice files with names such as `Arrays/SelectionSort.java` and `LinkedList/ReverseLinkedList.java`. Those remain in the root folders as part of the learning journey, while the new structured Java project under `src/main/java` provides a cleaner, reusable foundation for future development.

## Documentation

See the `docs/` folder for:

- overview of the repository
- complexity notes
- algorithm references

## Contributing

Contributions are welcome. Please read `CONTRIBUTING.md` before opening a pull request.

## License

This project is licensed under the MIT License. See `LICENSE` for details.
