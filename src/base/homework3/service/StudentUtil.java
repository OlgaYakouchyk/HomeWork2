package base.homework3.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class StudentUtil {

    public static <S> void printTreeSet(Set<S> TreeSetPrint) {
        for (S s : TreeSetPrint) {
            System.out.println(s);
        }
    }

    public static <T> void evenStudents(Collection<T> collection) {
        Iterator<T> interator = collection.iterator();
        int count = 0;
        while (interator.hasNext()) {
            if (count % 2 == 0) {
                System.out.println(interator.next());
           } else {
                interator.next();
            }
            count++;
        }
    }

    public static <T> void removeOddStudent(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (count % 2 != 0) {
                iterator.remove();

            }
            count++;
        }
    }
}