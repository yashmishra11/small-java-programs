import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumoffirstnnumbers {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n;
        System.out.println("enter the value of n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int sum = (n * (n + 1) / 2);
        System.out.println("sum of first n numbers : " + sum);

    }
}
