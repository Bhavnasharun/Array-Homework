import java.util.Scanner;

public class Transpose_matrix {
    public static void main(String[] args) {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and colums you want:");
        int row = scanner.nextInt();//you have to enter the row
        int column = scanner.nextInt();
        int array[][]=new int [row][column];
        System.out.println("Enter matrix:");//you have to enter the col
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < column; j++) {
                array [i][j]= scanner.nextInt();
                System.out.println(" ");}}
        System.out.println("Thee above matrix before transepose is");
        for (i = 0; i < row; i++) {//here you have to add total num
            for ( j = 0; j < column; j++) {
                System.out.print(array[i][j]+" ");}//will print
            System.out.println(" ");}
        System.out.println("The above matrix after Transpose is ");
        for ( i = 0; i < column; i++) {//will work out the number in rows and col
            for (j = 0; j < row; j++) {
                System.out.print(array[j][i]+" ");}
            System.out.println(" ");}}}
