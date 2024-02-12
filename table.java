package assigment1;

public class table {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        System.out.println("A\tB\tpow(A,B)");
        for(int a=1,b=2,i = 0; i <5 ; a++,b++,i++) {
            System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
        }
    }
}
