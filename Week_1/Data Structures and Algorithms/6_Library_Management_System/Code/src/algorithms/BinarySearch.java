package algorithms;

import entity.Book;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Book searchByTitle(Book[] books, String targetTitle) {
        Arrays.sort(books, Comparator.comparing(book -> book.title.toLowerCase()));

        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) return books[mid];
            else if (comparison < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

}