package exercises;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String response = input.nextLine();
        System.out.println("Hello " + response);
        input.close();
    }
}
