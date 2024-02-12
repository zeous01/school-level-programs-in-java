package assigment1;
import java.util.Scanner;
public class tenTimes {
    //Muhammad Zaryab 14444
    static double tentimes(double num)
    {
        return Math.pow(num,10);
    }

    public static void main(String[] args) {
        Scanner zeous= new Scanner(System.in);
        System.out.println("enter the number");
        double num= zeous.nextDouble();
        System.out.println("the ten time value of "+num+" is "+tentimes(num));
    }
}
