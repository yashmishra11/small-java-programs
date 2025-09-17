public class sumandavgofarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of element of array is :" + sum);
        float avg = sum / length;
        System.out.println("average of element of array is :" + avg);
    }
}
