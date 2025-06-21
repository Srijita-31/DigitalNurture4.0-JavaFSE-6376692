# Singleton Pattern:

This project demonstrates the implementation of the **Singleton Design Pattern** in Java using **lazy initialization**. The goal is to ensure that the `Logger` class has only one instance throughout the application's lifecycle to maintain consistent and memory-efficient logging behavior.

```
SingletonPatternExample/
├── Code/
│   ├── src/
│   │   ├── Logger.java
│   │   └── Main.java
│   └── Output/
└── README.md
```

## Problem Statement:

We need to ensure that a logging utility class in our application has only one instance throughout the application lifecycle to ensure consistent logging. The instance should only be created when it is actually needed (lazy loading).

## Implementation Summary:

- The `Logger` class:
  - Has a **private static instance** initialized to `null`.
  - Contains a **private constructor** to prevent external instantiation.
  - Provides a **public static method** `getInstance()` that lazily creates and returns the singleton instance.
  - Includes a `log()` method to simulate logging messages.
  - Includes a counter to prove that only one instance is created.

- The `Main` class demonstrates:
  - That multiple calls to `getInstance()` return the same object.
  - Logs messages using the singleton instance.

## Sample Output ( shown in screenshot):

```
Logger initialized
Log: This is the first message.
Log: This is the second message.
Only one instance exists. Singleton confirmed.
```

## How to Compile and Run:

Navigate to the `src` directory and run:

```
javac *.java
java Main
```

## Time Complexity:

- First call to `getInstance()`: O(1) (object is created)
- Subsequent calls to `getInstance()`: O(1)
- `log()` method: O(1)

 **Overall Time Complexity: O(1)**

## Benefits of Singleton Pattern (Lazy Initialization):

- Saves memory by creating the instance only when required.
- Ensures consistent logging behavior.
- Useful in scenarios like logging, database connection pooling, configuration managers, etc.

---

