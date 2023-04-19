import java.util.Arrays;
import java.util.Scanner;

public class Ascending_order {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
     //  System.out.println("Enter your number");
      // int num = scanner.nextInt();
        int[]array =new int []{-5, -9, 8, 12, 1, 3};// this number will print

        System.out.println("Elements of original array");
        for (int i = 0; i < array.length; i++) {//here will asseding order the number
            System.out.println(array[i]+" ");}
        Arrays.sort(array);
        System.out.println();//will print out
        System.out.println(
                "Elements array sorted in assending order:"+Arrays.toString(array)
        );
                                }
                }







