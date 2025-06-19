# Financial Forecasting 

This project implements a financial forecasting tool that predicts future values based on past data, utilizing a recursive algorithm. 

## Scenario:
We are developing a financial forecasting tool that predicts future values based on past data.

## Project Structure:

* `Code/`: Contains the Java class files and source file (`FinancialForecast.java`) implementing the recursive forecasting logic.
* `Output/`: Contains the screenshot of the generated output.

## Setup & Implementation:

The core logic for financial forecasting using a recursive approach is implemented within the `FinancialForecast.java` file.

### Recursive Algorithm Explanation:

**Concept of Recursion:**
Recursion is a programming technique where a function calls itself, directly or indirectly, to solve a problem. It breaks down a complex problem into smaller, similar subproblems. Each recursive call works on a smaller instance of the original problem until a "base case" is reached. The base case is a simple, non-recursive condition that provides a direct solution, preventing infinite recursion.

**How it Simplifies Problems:**
Recursion can simplify certain problems by:
1.  **Readability:** For naturally recursive problems (like tree traversals, fractal generation, or, in this case, sequential value calculations), the recursive solution often closely mirrors the problem definition, making the code more intuitive and easier to understand.
2.  **Concise:** It can lead to more concise code compared to iterative solutions, especially for problems that have a self-similar structure.
3.  **Divide and Conquer:** It naturally supports "divide and conquer" strategies, breaking a problem into smaller, independent subproblems.

### Future Value Calculation (Recursive Approach)

The `FinancialForecast.java` file implements a recursive method to calculate future value. The basic formula for future value (compounded annually) is:

FV = PV \times (1 + r)^n

Where:
* FV = Future Value
* PV = Present Value (initial amount)
* r = Growth Rate (as a decimal, e.g., 5% = 0.05)
* n = Number of periods (e.g., years)

A recursive approach would define FV(PV, r, n) in terms of FV(PV, r, n-1):

Base Case:
FV(PV, r, 0) = PV (The future value after 0 periods is just the present value)

Recursive Step:
FV(PV, r, n) = FV(PV, r, n-1) \times (1 + r)

This means the future value after `n` years is the future value after `n-1` years, compounded for one more year.

## How to Compile and Run:

1.  **Compile the Java file:**
    Use `javac` to compile the source code, directing the output `.class` file to the `Output` folder:
    ```bash
    javac -d ../Output FinancialForecast.java
    ```

2.  **Run the compiled program:**
    Navigate to the `Output` directory and run the `FinancialForecast` class:
    ```bash
    cd ../Output
    java FinancialForecast
    ```
    The program will prompt you to enter the present value, annual growth rate, and number of years.

## Analysis:

### Time Complexity of Recursive Algorithm

For the simple recursive future value calculation as described:

* **Time Complexity: O(n)$**
    * Each recursive call reduces the problem size by 1 (e.g., `n` becomes `n-1`).
    * There are `n` recursive calls until the base case (n=0) is reached.
    * Each call performs a constant amount of work (multiplication).
    * Therefore, the total number of operations is directly proportional to `n`.

* **Space Complexity: O(n)
    * Due to the recursive call stack. Each recursive call adds a new stack frame. For `n` calls, `n` stack frames are maintained until the base case is hit and the calls unwind.

### Optimization of the Recursive Solution

While simple and elegant for this problem, direct recursion can sometimes be inefficient due to:
1.  **Redundant Computations:** If the same subproblems are computed multiple times (this is not a major issue for *this specific* future value calculation, but it is for problems like Fibonacci sequence).
2.  **Stack Overflow:** For very large values of `n`, the deep recursion can lead to a "Stack Overflow Error" because the call stack exhausts available memory.

**To optimize recursive solutions and avoid excessive computation:**

1.  **Memoization (Top-Down Dynamic Programming):**
    * Store the results of expensive function calls and return the cached result when the same inputs occur again. This avoids redundant computations. For future value, this isn't strictly necessary as each `FV(n)` only depends on `FV(n-1)`.

2.  **Tabulation (Bottom-Up Dynamic Programming / Iterative Approach):**
    * Eliminate recursion entirely by solving the problem iteratively from the base case up to the desired `n`. This transforms the recursive logic into a loop.
    * For future value, an iterative approach using a loop is often preferred as it avoids stack overhead and can be more efficient in terms of space:
        ```java
        public double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
            double futureValue = presentValue;
            for (int i = 0; i < years; i++) {
                futureValue *= (1 + growthRate);
            }
            return futureValue;
        }
        ```
    * This iterative approach has a time complexity of O(n) and a space complexity of O(1) (constant space, as it doesn't use the call stack).

3.  **Tail Recursion Optimization (Language Dependent):**
    * Some compilers (like Scheme, Scala, Kotlin, and some C++ compilers) can optimize "tail-recursive" functions. A function is tail-recursive if the recursive call is the *last operation* performed in the function. In such cases, the compiler can convert the recursion into an iterative loop, eliminating stack overhead. Java's JVM generally does **not** perform tail call optimization (TCO), so explicitly converting to an iterative loop is necessary for performance-critical or deep recursion scenarios.

