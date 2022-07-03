package Homework;

//  напишите метод является ли число полиндромом

public class Homework2 {
    public static void main(String[] args) {
        int num = 678796;
        int rev=0;
        int i = 0;
        int originalNum = num;

        while(num!=0){
            rev = num % 10;
            i = i*10 + rev;
            num = num / 10;
        }

        if(originalNum == i)
            System.out.println("The number  is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");


    }
}
