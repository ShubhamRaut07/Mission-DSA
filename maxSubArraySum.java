public class maxSubArraySum {

    public static void printMaxSubArraySum(int[] numbers) {
        int sum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k]);
                    sum += numbers[k];

                }
                System.out.println(sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
            System.out.println();
        }
        System.out.println("Maxsum is:" + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printMaxSubArraySum(numbers);
    }
}
