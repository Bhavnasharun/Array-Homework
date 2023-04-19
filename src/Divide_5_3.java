import java.util.Scanner;

public class Divide_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to 100 numers");
        System.out.println("\n devided by 3");
        int num = scanner.nextInt();
        for (int i = 1; i < 100; i++) {
            if(i%3 == 0)//will do divsion 3
            System.out.print(i+", ");}
        System.out.println("\n\n divided by 5:");//will do seprated by 3num
        for (int i = 1; i <100 ; i++) {
            if (i%5 ==0)//will do division 5
            System.out.print(i + " ");}//print out the numbers and make the space
        System.out.println("\n");}//meance go next line

    }

