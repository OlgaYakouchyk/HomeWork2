package base.homework3.service;

import base.homework3.objects.Book;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class BooksUtil {

    public static <B> void printList(List<B> listForPrint) {
        for (B b : listForPrint) {
            System.out.println(b);
        }
    }

    public static void printHashSetBook(HashSet<Book> HashSat) {
        for (Book book : HashSat) {
            System.out.println(book.toString());
        }
    }

    private static boolean vowels(String string) {
        String letter = String.valueOf(string.charAt(0));
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static void printVowelNameBooks(Collection<Book> books) {
        Book[] array = new Book[books.size()];
        books.toArray(array);
        for (int i = 0; i < array.length; i++) {
            if (BooksUtil.vowels(array[i].getBookName())) {
                System.out.println(array[i]);
            }

        }
    }
}







