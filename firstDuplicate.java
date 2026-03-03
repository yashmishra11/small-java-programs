import java.util.HashSet;

public class Main {

    public static int FirstDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 2, 3, 5 };
        System.out.println("First duplicate number: " + FirstDuplicate(nums)); //here we return the value of this method applied to this array, not the whole array
    }
}
