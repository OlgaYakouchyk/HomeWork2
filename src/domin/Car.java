package domin;

public class Car {

    public static int count = 0;

    public int yearOfCreation;

    public String model;

    public String ownerFullName;

    public double engineVolume;

    public Car() {
    }

    public Car(int yearOfCreation, String model, String ownerFullName, double engineVolume) {
        this.yearOfCreation = yearOfCreation;
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.engineVolume = engineVolume;


        }


    }

