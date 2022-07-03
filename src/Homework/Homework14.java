package Homework;

/* Сооздайте программу с тремя переменными целогопита, присвойте им значение, если первая переменная больше второй, то
увеличьте ее на 3, иначе увеличьте значение втрой переменной на 8.
 В конце прграммы выведите значение обоих переменных на экран.*/

public class Homework14 {
    public static void main(String[] args) {

        int a = 6;
        int b = 4;

        if (a>b){
            a +=3;
            System.out.println(a);
            System.out.println(b);
        }
        else if (a<b) {
            b +=8;
            System.out.println(b);
            System.out.println(a);

        }
    }
}
