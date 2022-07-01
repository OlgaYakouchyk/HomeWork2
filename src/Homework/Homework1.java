package Homework;

//напишите метод который будет увеличивать каждый элемент массива на 10%

public class Homework1 {
    public static void main(String[] args) {

        //объявление массива
       float[] new_arr1 = new float[] {73f, 52f, 22f, 1f, 8f, 96f, 67f, 988f};

       //переменная которая хранит весь массив
       float a= new_arr1.length;

       // цикл for  который пробегает по всем элементам массива
        for (int i = 0; i < a; i++) {
            // веводим на консоль все элементы
            //System.out.println(new_arr1[i] + " original array");

            //увеличение каждого элемента массива и сохраниение его?????????????????
           //new_arr1[i]= new_arr1[i] *=0.10f;   // вывели 10% от каждщго эл
           // new_arr1[i]= new_arr1[i] +10; // +10 к каждому эл
           new_arr1[i]= new_arr1[i]+=(new_arr1[i]*10/100);
           System.out.println(new_arr1[i]);

        }


        }
        }

