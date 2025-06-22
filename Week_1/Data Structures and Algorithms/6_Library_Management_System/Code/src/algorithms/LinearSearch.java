package algorithms;

import entity.Book;

public class LinearSearch {
    public static Book searchByTitle(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

}