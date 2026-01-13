import java.util.Scanner;

public class adddigitsinnum {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            sum = sum + lastDigit;
        }
        System.out.println("sum of all digits is " + sum);
    }
}
