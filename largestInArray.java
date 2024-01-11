// import java.util.*;

public class largestInArray {

    public static int getLargest(int[] num) {
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }

            if(smallest>num[i]){
                smallest=num[i];
            }
            
        }
        System.out.println("Smallest in array:" + smallest);

        return largest;
    }

    public static void main(String args[]) {
        int[] numbers = { 1, 2, 5, 3, 7, 6, 4 };
        System.out.println("Largest in array is:" + getLargest(numbers));

    }
}
