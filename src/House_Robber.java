import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

/**
 * Created by nlfox on 16-8-5.
 */

public class House_Robber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        switch (nums.length) {
            case 0: {
                return 0;
            }
            case 1: {
                return nums[0];
            }
            case 2: {
                return Math.max(nums[0], nums[1]);
            }
            default: {
                dp[0] = nums[0];
                dp[1] = Math.max(nums[1], dp[0]);
                for (int j = 2; j < nums.length; j++) {
                    dp[j] = Math.max(dp[j - 1], dp[j - 2] + nums[j]);
                }
                return dp[nums.length - 1];
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}
