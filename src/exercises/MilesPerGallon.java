package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type miles traveled: ");
        int miles = input.nextInt();
        System.out.println("Type gallons used: ");
        int gallons = input.nextInt();
        int calc = miles / gallons;
        System.out.println("MPG: " + calc);
        input.close();
    }
}
