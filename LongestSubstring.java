import java.util.*;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.print("enter your string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(
                "Max length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
        sc.close();

    }

}
