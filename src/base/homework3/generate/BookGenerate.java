package base.homework3.generate;

import base.homework3.objects.Book;

import java.util.Collection;

public class BookGenerate {

    public static Collection<Book> bookAdding(Collection<Book> books, int numberAllBooks, int numberRepeatBooks) {
        Book book = new Book();
        for (int i = 0; i < numberAllBooks - numberRepeatBooks; i++) {
            books.add(new Book(book.getArrayOfBookName()[1], book.getArrayOfAuthorFirstName()[1],
                    book.getArrayOfAuthorLastName()[1], book.getArrayOfAuthorMiddleName()[1]));
        }
        for (int i = 0; i < numberRepeatBooks; i++) {
            books.add(new Book("default", "default", "default",
                    "default"));
        }
        return books;
    }
}

