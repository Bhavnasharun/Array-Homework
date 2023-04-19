import java.util.Scanner;

public class Count_A {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Type the all a and will get answer how many a are");
        String str = scanner.next();

        char findchar = 'a';
        int count =0;
        for (int i = 0; i < str.length(); i++) {//read the all a without speace
            if (str.charAt(i)==findchar){

                count++;//count the numbers
            }
        System.out.println("The charactor' "+findchar+" 'inthe string is ' "+
                count + " ' times " );//result will print out


        }}}







