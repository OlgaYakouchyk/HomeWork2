package Homework;

/* Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10,
максимум 35, шаг 5, то вывод должен быть таким:10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем.
 */

public class Homework16 {
    public static void main(String[] args) {

        int [] arry = new int[20]; {
        }
        int min = 10;
        int max = 60;
        int step = 10;

        for (int i = min; i < max; i+=step) {

            System.out.println(i);

        }

    }
}
