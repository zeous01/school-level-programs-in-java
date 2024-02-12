package assigment1;

public class perimeterAreawithHeightAndWidth {
    //Muhammad Zaryab 14444
    public static void main(String[] args) {
        float height= 7.9f, width = 4.5f, area, perimeter, radius;
        radius=height/2;
        area=width*height;
        perimeter= 2 * radius * 3.14f;
        System.out.println("perimeter = "+perimeter);
        System.out.println("area = "+area);
    }
}
