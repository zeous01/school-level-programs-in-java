package assigment1;
import java.util.Objects;
import java.util.Scanner;
public class speedOfSound {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        final float air =1100, water =4900, steel =16400;
        Scanner zeous=new Scanner(System.in);
        String meduim;
        float time=0;
        System.out.println("please enter the medium (air/water/steel)");
        meduim= zeous.nextLine();
        while (
                Objects.equals(meduim, "air") || Objects.equals(meduim, "AIR") || Objects.equals(meduim, "Air")
                || Objects.equals(meduim, "water") || Objects.equals(meduim, "WATER") ||
                Objects.equals(meduim, "Water") ||
                Objects.equals(meduim, "steel") || Objects.equals(meduim, "STEEL") ||
                Objects.equals(meduim, "Steel")
        ){
            System.out.println("invalid medium please enter the right medium (air/water/steel)");
            meduim= zeous.nextLine();
        }
        System.out.println("enter the distance in feet");
        float distance= zeous.nextFloat();
        while (distance<0){
            System.out.println("invalid distance please enter the right distance");
            distance= zeous.nextFloat();
        }
        if (Objects.equals(meduim, "air") || Objects.equals(meduim, "AIR") || Objects.equals(meduim, "Air")){
            time=distance*air;
        } else if (Objects.equals(meduim, "water") || Objects.equals(meduim, "WATER") || Objects.equals(meduim, "Water")) {
            time=distance*water;
        } else if (Objects.equals(meduim, "steel") || Objects.equals(meduim, "STEEL") || Objects.equals(meduim, "Steel")) {
            time=distance*steel;
        }
        else {
            System.out.println("invalid medium");
        }
        System.out.println("sound travel "+distance+" in "+meduim+" in "+time+" seconds");
        zeous.close();
    }
}
