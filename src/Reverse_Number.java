import java.util.Scanner;
public class Reverse_Number {
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    System.out.println("enter1 to 5 numbers");
        int num = scanner.nextInt();

      int array[]=new int[]{1,2,3,4,5};//this number will print out the reverse

      //  System.out.println("Original array");
      //  for (int i = 0; i < array.length; i++) {
     //   System.out.println(array[i]+" ");
      //  }
        //System.out.println();


        System.out.println("Array in reverse order:");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]+" ");

        }}

    }


