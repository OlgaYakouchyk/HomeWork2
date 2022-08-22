package base.homework3.objects;

import java.util.Arrays;
import java.util.Comparator;

public class Book implements Comparator {

    private String bookName;
   private final String[] arrayOfBookName = new String[]{"Calypso", "The Water Dancer", "Harry Potter", "Bloody Genius",
            "The Dutch House","Every Breath", "Fire ana Blood", "Revenge", "Verity", "Twisted Love", "The Colony",
            "After Sappho", "The Light We Carry", "Glony", "Case Study", "I wish I Knew", "MEZCLA", "The Trees",
            "Treacle Walker", "Trust", "On William", "The Lincoln Highway", "April in Spain", "Second Place",
            "The Gardener", "The king og Dead"};

    private String authorFirstName;
    private final String[] arrayOfAuthorFirstName = new String[] {"David", "Ta-Nehisi", "Joane", "John", "Ann", "Nicholas", "George",
            "Tom", "Collen", "Ana", "Andrei", "Michelle", "Tess", "NoViolet", "Graeme", "Donna", "Ixta", "Percival",
            "Herman", "Elizabet", "Amor", "John", "Rachel", "Sally", "Benjamin"};

    private String authorLastName;
    private final String[] arrayOfAuthorLastName = new String[]{"Sedaris", "Coates", "Rowling", "Sandford", "Patcheff", "Sporks",
            "Martin", "Bower", "Hover", "Huang", "Magee", "Obama", "Gunty", "Bulowoyo", "Macrae", "Ashworth",
            "Belfrege", "Everaff", "Garner", "Diaz", "Strout", "Towles", "Banvill", "Cush", "Viskers", "Dean"};

    private String authorMiddleName;
    private final String[] arrayOfAuthorMiddleName = new String[]{"Maeve", "Alice", "Wren", "Rose", "Claire", "Mae", "Grace", "Nova",
            "Jane", "Elizabeth", "Sage", "Margareth", "Harper", "Arden", "Royal", "Kai", "Atlas", "Oscar", "Jude",
            "Henry", "James", "Bony", "River", "Nico", "Louise", "Thomas", "Alexander"};

    public Book() {
    }

    public Book(String bookName, String authorFirstName, String authorLastName, String authorMiddleName) {
        this.bookName = bookName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.authorMiddleName = authorMiddleName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String[] getArrayOfBookName() {
        return arrayOfBookName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String[] getArrayOfAuthorFirstName() {
        return arrayOfAuthorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String[] getArrayOfAuthorLastName() {
        return arrayOfAuthorLastName;
    }

    public String getAuthorMiddleName() {
        return authorMiddleName;
    }

    public void setAuthorMiddleName(String authorMiddleName) {
        this.authorMiddleName = authorMiddleName;
    }

    public String[] getArrayOfAuthorMiddleName() {
        return arrayOfAuthorMiddleName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", arrayOfBookName=" + Arrays.toString(arrayOfBookName) +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", arrayOfAuthorFirstName=" + Arrays.toString(arrayOfAuthorFirstName) +
                ", authorLastName='" + authorLastName + '\'' +
                ", arrayOfAuthorLastName=" + Arrays.toString(arrayOfAuthorLastName) +
                ", authorMiddleName='" + authorMiddleName + '\'' +
                ", arrayOfAuthorMiddleName=" + Arrays.toString(arrayOfAuthorMiddleName) +
                '}';
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }


}


