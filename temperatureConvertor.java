package assigment1;
import java.util.Scanner;
public class temperatureConvertor {
    //Muhammad Zaryab 14444
    static double CelsiusToFahrenheit(double a){
        return (a*9/5)+32;
    }
    static double FahrenheitToCelsius(double a){
        return (a-32)*5/9;
    }
    public static void main(String[] args) {
        Scanner zeous=new Scanner(System.in);
        double temperature,convert;
        System.out.println("please enter the temperature");
        temperature=zeous.nextDouble();
        System.out.println("what you want to do (1,2)\n1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
        int choice = zeous.nextInt();
        if (choice==1){
            convert=CelsiusToFahrenheit(temperature);
            System.out.println("the temperature "+temperature+" into fahrenheit is "+convert);
        } else if (choice==2) {
            convert=FahrenheitToCelsius(temperature);
            System.out.println("the temperature "+temperature+" into Celsius is "+convert);
        }
        else
            convert=0;

    }
}
