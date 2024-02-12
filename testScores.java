package assigment1;
import java.util.Scanner;
public class testScores {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        Scanner zeous= new Scanner(System.in);
        float score1, score2, score3, sum, avg;
        char grade;
        System.out.println("please enter the test score 1");
        score1= zeous.nextFloat();
        System.out.println("please enter the test score 2");
        score2= zeous.nextFloat();
        System.out.println("please enter the test score 3");
        score3= zeous.nextFloat();
        sum=score1+score2+score3;
        avg=sum/3;
        if (avg>=80){
            grade = 'a';
        } else if (avg<80 && avg>=70) {
            grade='b';
        } else if (avg<70 && avg>=60) {
            grade='c';
        } else if (avg<60 && avg>=50) {
            grade='d';
        } else {
            grade='f';
            System.out.println("you`re fail");
        }
        System.out.println("Average Score = "+avg+"\nYour Grade = "+grade);

    }
}
