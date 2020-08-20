package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the length:");
        int length = input.nextInt();
        System.out.println("Type the width:");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("Area of the rectangle:" + area);
        input.close();
    }
}
