package exercises;

public class Practice {
    //make a method
        //takes in an array of integers
        //returns the sum of the first and last value in the array
    public static int sumOfFirstAndLast(int[] array) {
        return array[0] + array[array.length-1];
    }

    public static void main(String[] args) {
        int[] anArray = {5, 1, 9, 10, -4, 9, 11};
        int result = sumOfFirstAndLast(anArray);
        System.out.println(result);
    }

}
