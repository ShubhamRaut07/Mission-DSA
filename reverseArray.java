public class reverseArray {

    public static void reverseArrayFun(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

    }  

    public static void main(String args[]) {
        int[] arr = { 1, 5, 3, 2, 6, 4, 7 };

        reverseArrayFun(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
