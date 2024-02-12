package assigment1;
import java.util.Scanner;

public class PopulationPredictor {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        Scanner zeous = new Scanner(System.in);
        System.out.print("Enter the starting population size (minimum 2): ");
        int population = zeous.nextInt();

        while (population < 2) {
            System.out.print("Invalid input. Enter the starting population size (minimum 2): ");
            population = zeous.nextInt();
        }

        System.out.print("Enter the average daily population increase (as a percentage): ");
        double dailyIncrease = zeous.nextDouble();

        while (dailyIncrease < 0) {
            System.out.print("Invalid input. Enter the average daily population increase (as a percentage): ");
            dailyIncrease = zeous.nextDouble();
        }

        System.out.print("Enter the number of days they will multiply (minimum 1): ");
        int numDays = zeous.nextInt();

        while (numDays < 1) {
            System.out.print("Invalid input. Enter the number of days they will multiply (minimum 1): ");
            numDays = zeous.nextInt();
        }

        System.out.println("Day\tPopulation Size");
        System.out.println("--------------------");

        for (int i = 1; i <= numDays; i++) {
            int newPopulation = (int) Math.round(population * (1+dailyIncrease / 100));
            System.out.println(i + "\t" + newPopulation);
            population = newPopulation;
        }
    }
}

