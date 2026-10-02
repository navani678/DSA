import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = target - nums[i];

            if (map.containsKey(current)) {
                return new int[]{map.get(current), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("indices: " + Arrays.toString(result));
    }
}