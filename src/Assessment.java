import java.util.ArrayList;

public class Assessment {


    public static int square(int number) {
        return number * number;

    }

    public static int sum(int number1, double number2) {
        return (int) (number1 + number2);

    }




    public static double getAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }






    public static void main(String[] args) {
        System.out.println(square(5));

        System.out.println(sum(4, 5));
        System.out.println(getAverage(10, 2));

        ArrayList<String> capitalizeRecords = new ArrayList<String>();
    }

}