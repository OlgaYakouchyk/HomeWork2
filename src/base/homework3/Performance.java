package base.homework3;

import base.homework3.generate.StudentGenerate;
import base.homework3.objects.Student;
import base.homework3.service.BooksUtil;
import base.homework3.comparator.ComparatorAuthorLastName;
import base.homework3.comparator.ComparatorAuthorMiddleName;
import base.homework3.comparator.ComparatorAuthorName;
import base.homework3.generate.BookGenerate;
import base.homework3.objects.Book;
import base.homework3.service.StudentUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Performance {
    public static void main(String[] args) {

        System.out.println("____________task1____________________");
        List<Book> books = new LinkedList<>();
        books.addAll(BookGenerate.bookAdding(books, 20, 0));
        books.remove(6);
        BooksUtil.printList(books);


        System.out.println("_________________task2__________________");
        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.addAll(BookGenerate.bookAdding(books,25,6));
        BooksUtil.printHashSetBook(bookHashSet);

        System.out.println("_______________task3_________________________");
        List<Book> sortedListOfBook = new LinkedList<>();
        sortedListOfBook.addAll(BookGenerate.bookAdding(books,20,0));
        Comparator firstNameComparator = new ComparatorAuthorName();
        Collections.sort(books, firstNameComparator);
        BooksUtil.printList(books);
        Comparator lastNameComparator = new ComparatorAuthorLastName();
        Collections.sort(books, lastNameComparator);
        BooksUtil.printList(books);
        Comparator middleNameComparator = new ComparatorAuthorMiddleName();
        Collections.sort(books, middleNameComparator);
        BooksUtil.printList(books);

        System.out.println("__________________task4______________");
        Set<Student> students = new TreeSet<>();
        students.addAll(StudentGenerate.studentsAdding(students, 7));
        StudentUtil.printTreeSet(students);
        StudentUtil.evenStudents(students);
        StudentUtil.removeOddStudent(students);

    }
}





