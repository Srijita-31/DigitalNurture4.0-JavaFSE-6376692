import algorithms.BinarySearch;
import algorithms.LinearSearch;
import entity.Book;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
                new Book(1, "Machine Learning", "Tom Mitchell"),
                new Book(2, "Deep Learning", "Ian Goodfellow"),
                new Book(3, "Digital Image Processing", "Castleman"),
                new Book(4, "Computer Vision", "Richard Szeliski")
        };
        System.out.print("Enter book title:");
        String target = sc.nextLine();

        Book linearResult = LinearSearch.searchByTitle(books, target);
        System.out.println("Linear Search: " +
                (linearResult != null ? linearResult : "Book not found"));

        Book binaryResult = BinarySearch.searchByTitle(books, target);
        System.out.println("Binary Search: " +
                (binaryResult != null ? binaryResult : "Book not found"));
    }
}