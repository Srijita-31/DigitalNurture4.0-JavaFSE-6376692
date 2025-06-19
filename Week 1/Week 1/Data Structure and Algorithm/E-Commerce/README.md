## E-commerce Platform Search Function
This folder contains the Java code and related files for the E-Commerce search function application.

## Scenario:
We are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance to improve user experience and efficiency.

## Setup:

A class `Product` is created with the following attributes:
- `productId`
- `productName`
- `category`

These attributes allow us to search products by name or category.

## Implementation:

Two searching algorithms are implemented:
- **Linear Search** – used on an **unsorted array** of products.
- **Binary Search** – used on a **sorted array** of products (sorted by `productName`).

Products are stored in an array of `Product` objects.

## Structure:
- `Code/`: Contains the Java class files and source files (`Main.java`, `Product.java`).
- `Output/`: Contains the screenshot of the generated output.

## How to Run:
1. Compile the Java files from the `Code` directory:
   ```bash
   javac -d ../Output Main.java Product.java
   ```
2. Run the main class from the `Output` directory:
   ```bash
   java -cp ../Output Main
   ```

### Time Complexity Comparison:

The following table and explanation are based on the actual code implementation:

| Operation                  | Time Complexity              | Explanation                                                                 |
|---------------------------|------------------------------|-----------------------------------------------------------------------------|
| **Linear Search**         | Best: O(1) <br> Worst: O(n)   | Loops through each product using a `for` loop. Efficient if match is early. |
| **Binary Search**         | Best: O(1) <br> Worst: O(log n) | Uses a `while` loop with mid-point logic, reducing search space by half.   |
| **Sorting (for Binary)**  | O(n log n)                    | Uses `Arrays.sort()` (TimSort), which is needed before performing binary search. |

### Explanation

- The **linear search** function uses a basic `for-each` loop to compare each product name. It's straightforward but takes longer as the number of products increases.
- The **binary search** function works only after sorting. It uses a `while` loop with a mid-point check, which makes it faster for large, sorted arrays.
- The call to `Arrays.sort()` before binary search adds a one-time cost of **O(n log n)** to prepare the data.

### Conclusion

-  We use **Linear Search** for small or unsorted product lists.
-  We use **Binary Search** for large, sorted product lists — it's significantly faster.
- For performance-focused platforms, **Binary Search is the preferred approach** once the array is sorted.

