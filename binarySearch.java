// import java.util.*;  

public class binarySearch {

    public static int binarySearchFun(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == num[mid]) {
                return mid;
            }

            if (num[mid] < key) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 7;

        System.out.println("Key found at index:" + binarySearchFun(arr, key));

    }
}