package base.homework3.comparator;

import base.homework3.objects.Book;

import java.util.Comparator;

public class ComparatorAuthorName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorFirstName().compareTo(o2.getAuthorFirstName());
    }
}
