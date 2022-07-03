package Homework;
// напишите программу с тремя переменными целого пита. Определите какое из них наибольшее

public class Homework11 {
    public static void main(String[] args) {

        int a = 88;
        int b = 63;
        int c = 95;
            if (a >= b && a >= c) {
                System.out.println("max is " +  a);
            }
        else if (b >= c && b >=a) {

                System.out.println("max is " + b);
            }
        else  {
            System.out.println("max is " +  c);

        }

    }
}