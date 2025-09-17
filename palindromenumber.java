import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int reversedNumber = 0, temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reversedNumber)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}
