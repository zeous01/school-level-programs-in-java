package assigment1;
import java.util.Scanner;
public class timeCalculator {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        Scanner zeous=new Scanner(System.in);
        System.out.println("enter the time in seconds");
        int seconds= zeous.nextInt();
        if (seconds < 86400) {
            System.out.print(seconds+" is ");
        }
        if (seconds==86400){
            System.out.println(seconds+" second is 1 day");
        }
        if (seconds > 86400) {
            int days = seconds / 86400;
            System.out.print(seconds + " seconds is " + days + " days, ");
            seconds %= 86400;
        }
            if (seconds >= 3600) {
                int hours = seconds / 3600;
                System.out.print(hours + " hours");
                seconds %= 3600;
            }
            if (seconds >= 60) {
                int minutes = seconds / 60;
                System.out.print(" ," + minutes + " minutes and ");
                seconds %= 60;
            }
            if (seconds > 0) {
                System.out.println(seconds + " seconds");
            }

    }
}
