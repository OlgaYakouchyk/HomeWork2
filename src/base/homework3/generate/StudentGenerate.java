package base.homework3.generate;

import base.homework3.objects.Student;

import java.util.Collection;
import java.util.Random;

public class StudentGenerate {

    public static Collection<Student> studentsAdding(Collection<Student> students, int number) {
        Student student = new Student();
        for (int i = 0; i < number; i++) {
            students.add(new Student(student.getArrayStudentName()[1], student.getArrayStudentAge()[1],
                    student.getArrayStudentID()[1]));
            System.out.println(students);
        }
        return students;
    }
}
