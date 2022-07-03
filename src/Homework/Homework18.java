package Homework;

// Напишите метод переводящий рубли в доллоры по заданному курсу. В качестве аргументов укажите кол-во руб и курс.
public class Homework18 {
    public static void main(String[] args) {

        float rubles = 1000F;
        float USD = 2.67F;

        String currency = "USD";
        //System.out.println(currency);

        if (currency.equals("USD")) {
            System.out.println(rubles / USD + " USA");
        }
    }
}




