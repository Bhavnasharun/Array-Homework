import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int[]arr={23,34,45,56,67,23,34,45,56,29};//all of the elements will print first
        System.out.println("original Array:"+ Arrays.toString(arr));
        int removeIndex=1;//will remove one number
        for (int i = removeIndex; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];}
            System.out.println("After remove"+Arrays.toString(arr));}}
//last print out the


