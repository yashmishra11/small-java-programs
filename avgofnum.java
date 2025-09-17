import java.util.Scanner;

public class avgofnum {
    public static void main(String[] args) {
        int count;
        System.out.println("enter the count of numbers: ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        float average = 0;
        for (int i = 0; i < count; i++) {
            number = sc.nextInt();
            sum = sum + number;
        }
        average = sum / count;
        System.out.println("the average is: " + average);
    }
}