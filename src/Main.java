import base.Util.CarUtil;
import base.Car;
import base.service.CarDescribeInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car (2018, "Altima", "Nissan", 2.5D, 67.76D,
                "Silver", 4);
        Car car2 = new Car(2014, "Camaro", "Chevrolet", 3.6, 130.7,
                "Black grey", 2);
        Car car3 = new Car(2017, "A4", "Audi", 2.0, 20.910,
                "Blue", 4);
        Car car4 = new Car(2021, "RAV4", "Toyota", 2.0, 17.5,
                "Black",4);
        Car car5 = new Car(2013, "3", "Mazda", 2.5, 256.876,
                "Orange", 2);
        Car car6 = new Car(2018, "1500 Crew CabV", "RAM", 5.7, 57.87,
                "White", 4);
        Car car7 = new Car(2014, "5", "BMW", 2.0, 138.97,
                "Red", 4);
        Car car8 = new Car(2020, "Tiguan2", "Volkswagen", 2.0, 41.34,
                "Purple", 4);
        Car car9 = new Car(2014, "XC60", "Volvo", 2.4, 38.546,
                "Gold", 4);
        Car car10 = new Car(2013, "Grand Cherokee", "Jeep", 3.6,
                241.453, "Yellow", 4);


        int sum = car.getSum(7, 56);
        System.out.println(sum);

        double sum1 = car.getSum(3,5,87);
        System.out.println(sum1);

        System.out.println(car.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        System.out.println(car6.toString());
        System.out.println(car7.toString());
        System.out.println(car8.toString());
        System.out.println(car9.toString());
        System.out.println(car10.toString());

        CarUtil.generateArray();

        System.out.println(car2.equals(car6));


        System.out.println(car2.getMileage());
        System.out.println(car2.getModel());


        car4.setColor("Pink");
        System.out.println(car4.getColor());

        CarDescribeInterface carDescribeInterface = new Car();
        carDescribeInterface.brake();
        carDescribeInterface.run();
        carDescribeInterface.gas();
        carDescribeInterface.makeSignal();

        Car[] cars = new Car[5];

        Car car01 = new Car();
        car01.setYearOfCreation(2018);
        Car car02 = new Car();
        car2.setYearOfCreation(2014);
        Car car03 = new Car();
        car03.setYearOfCreation(2017);
        Car car04 =new Car();
        car04.setYearOfCreation(2021);
        Car car05 = new Car();
        car05.setYearOfCreation(2013);

        cars[0] = car;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        Arrays.sort(cars);

        for (Car tempCar : cars){
            System.out.println(tempCar);

        }

    }
}
