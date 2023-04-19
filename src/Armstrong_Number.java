import java.util.Scanner;

public class Armstrong_Number {
    //checking the number is armstromg are not
        static boolean isArmstrong(int n){
            int temp, digits=0,last=0,sum=0;
            //assigning n into the tem variable
            temp=n;//loop execute untill the condition becomes false
            while(temp>0){temp=temp/10;
                digits++;}
            temp = n;
            while(temp>0){//determines the last number
                last =temp%10;
                //calculate the power of a number
                sum+=(Math.pow(last,digits));//remove the last digit
                temp =temp/10;}//compair the sum with n
            if(n==sum)//returns if sum and n are equal
                return true;//return if sums are not equals
            else return false;}//driver code

    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        num= scanner.nextShort();
        if (isArmstrong(num)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not aremstrong");
        }
    }
}


