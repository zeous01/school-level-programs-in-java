package assigment1;
import java.util.Scanner;
public class distance {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        //float speed, time;

        Scanner zeous=new Scanner(System.in);

        float speed, time;

        System.out.println("please enter the speed of the vehicle MPH (miles-per-hours)");
        speed= zeous.nextFloat();

        while(speed<0){
            System.out.println("invalid speed please enter the right speed");
            speed= zeous.nextFloat();
        }

        System.out.println("please enter the time travelled in hours");
        time= zeous.nextFloat();

        while(time<1) {
            System.out.println("invalid time please enter the right time");
            time = zeous.nextFloat();
        }

        System.out.println("HOURS\tDISTANCE");
        System.out.println("----------------");

        for(int i =1; i<=time;i++){

            System.out.println(i+"\t\t"+(i*speed));

        }
    }
}
