package Homework;

// ОбЪявить две переменыые целого типа. Необходимо поменять значение переменных так, что бы значение первой оказалось
// во второй, а второй в первой

public class Homework9 {
    public static void main(String[] args) {
        int i =987;
        int b = 56543;
        int tempr;
        tempr= i;
        i=b;
        b=tempr;
        System.out.println(b);


    }
}
