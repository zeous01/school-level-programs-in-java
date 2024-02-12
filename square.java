package assigment1;
import java.util.Scanner;
public class square {
    //Muhammad Zaryab 14444
    static int square(int a){
        return (int) Math.pow(a,2);
    }
    public static void main(String[] args) {
        Scanner zeous= new Scanner(System.in);
        System.out.println("enter the int argument");
        int number = zeous.nextInt();
        System.out.println(square(number));

    }
}
