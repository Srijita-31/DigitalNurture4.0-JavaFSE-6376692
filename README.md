# E-commerce Platform Search Function

## Scenario

We are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance to improve user experience and efficiency.

## Setup

A class `Product` is created with the following attributes:
- `productId`
- `productName`
- `category`

These attributes allow us to search products by name or category.

## Implementation

Two searching algorithms are implemented:
- **Linear Search** – used on an **unsorted array** of products.
- **Binary Search** – used on a **sorted array** of products (sorted by `productName`).

Products are stored in an array of `Product` objects.

###  Sample Input:
Enter product name to search: Mobile
### Sample Output:
Linear Search: 4 - Mobile - Electronics
Binary Search: 4 - Mobile - Electronics

### Time Complexity Comparison

| Algorithm       | Best Case | Worst Case |
|-----------------|-----------|------------|
| Linear Search   | O(1)      | O(n)       |
| Binary Search   | O(1)      | O(log n)   |

- **Linear Search** checks each item one by one and is simple to implement.
- **Binary Search** is much faster but only works on **sorted data**.

### Conclusion

For small datasets, linear search is acceptable.  
But for a real-world e-commerce platform where thousands of products exist, **binary search is more suitable** due to its **logarithmic time complexity**, which scales much better.

**Binary search is preferred** when performance is important and the product list is sorted in advance.



