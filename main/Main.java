package main;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArrayBruteForce(nums));
        System.out.println();
        System.out.println(maxSubArrayOneLoop(nums));
    }

    public static int maxSubArrayBruteForce(int[] nums) {
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                if (temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
        // O(n^2) - Time complexity
        // O(2) - Space complexity
    }

    public static int maxSubArrayOneLoop(int[] nums) {
        int sum = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp + nums[i]) {
                temp = nums[i];
            }
            else {
                temp += nums[i];
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
        // O(n) - Time complexity
        // O(2) - Space complexity
    }
}
