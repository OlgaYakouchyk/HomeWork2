package base.homework3.comparator;

import base.homework3.objects.Book;

import java.util.Comparator;

public class ComparatorAuthorLastName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorLastName().compareTo(o2.getAuthorLastName());
    }
}
