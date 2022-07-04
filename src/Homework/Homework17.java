package Homework;

// Все элементы массива поделить на значение наибольшего элемента этого массива.


public class Homework17 {
    public static void main(String[] args) {

        float[] new_array = new float[]{5f, 67f, 3f, 76f, 54f, 12f, 78, 456f, 122f, 22f};
        float a = new_array.length;
        for (int i = 0; i < a; i++) {
            System.out.println(new_array[i]);
        }
        //max
        float max = new_array[0];
       /* for (int i = 0; i < a; i++) {
            if (new_array[i] > max) ;{
                max = new_array[i];*/

        for (float i: new_array) {
            if (i>max);
            max = i;

            }

            System.out.println(" max is " + max);

        }

    }

