import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = (n * (n + 1) / 2);
        System.out.println("sum of first " + n + " numbers is : " + sum);
        sc.close();
    }
}
