package assigment1;
import java.util.Scanner;
public class samallestElement {
    //Muhammad Zaryab 14444
    public static double min(double[] array) {
    double min = array[0];
        for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
        return min;
}
    public static void main(String[] args) {
        Scanner zeous = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = zeous.nextDouble();
        }

        double min = min(numbers);

        System.out.println("The minimum value is " + min);
    }
}
