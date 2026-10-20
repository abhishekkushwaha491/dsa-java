# DSA in Java

A practical Java repository for learning and practicing Data Structures and Algorithms.

## Purpose

This repo is designed for:
- learning core DSA concepts in Java
- writing clean and readable implementations
- understanding time complexity and edge cases
- practicing problem solving with real examples
- building a reusable Java project structure

## Topics included

- Arrays
- Linked Lists
- Stacks
- Trees
- Searching
- Sorting
- String problems
- Binary Search
- Bit Manipulation

## Repository structure

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
│   ├── complexity-guide.md
│   └── edge-cases.md
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

- Java 17+
- Maven 3.8+

### Clone

```bash
git clone https://github.com/abhishekkushwaha491/dsa-java.git
cd dsa-java
```

### Build

```bash
mvn clean compile
```

### Run tests

```bash
mvn test
```

### Run example program

```bash
mvn exec:java
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

## Complexity and edge case notes

Every major data structure and algorithm in this repo is documented with:
- time complexity
- space complexity
- edge cases

You can review those notes in:
- `docs/complexity-guide.md`
- `docs/edge-cases.md`

## Original problem files

The repository still contains original practice files such as:
- `Arrays/SelectionSort.java`
- `LinkedList/ReverseLinkedList.java`

These remain as historical problem-solving files, while the structured Java code under `src/main/java` is meant to be a cleaner reusable foundation.

## Contributing

We welcome improvements, bug fixes, and new DSA implementations.
Please read `CONTRIBUTING.md` before opening a pull request.

## License

This project is licensed under the MIT License. See `LICENSE` for details.
