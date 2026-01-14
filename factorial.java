import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        int n = 0;
        long firstNum = 0; // use int for smaller numbers
        long secondNum = 1;
        long nextNum;
        System.out.println("enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + ",");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        sc.close();
    }
}
