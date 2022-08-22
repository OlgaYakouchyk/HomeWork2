package base.homework3.objects;

import java.util.Arrays;

import java.util.Comparator;


public class Student implements Comparable<Student>{

    private String name;
    private final String[] arrayStudentName = new String[]{"Alex", "Vadim", "Robert", "Lana", "Elia", "Mark",
            "Henry", "Jahn", "Marika", "Lisa"};
    private int age;
    private final int[] arrayStudentAge = new int[]{23, 29, 20, 19, 25, 28, 22, 30, 24, 27};

    private int ID;
    private final int[] arrayStudentID = new int[]{63788, 837398, 7262442, 63345266, 77664646, 9373363, 7768363,
            1636377, 28474748, 18464577};

    public Student() {
    }

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArrayStudentName() {
        return arrayStudentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getArrayStudentAge() {
        return arrayStudentAge;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getArrayStudentID() {
        return arrayStudentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", arrayStudentName=" + Arrays.toString(arrayStudentName) +
                ", age=" + age +
                ", arrayStudentAge=" + Arrays.toString(arrayStudentAge) +
                ", ID=" + ID +
                ", arrayStudentID=" + Arrays.toString(arrayStudentID) +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}


















