package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[100004];
        int length = nums.length;
        for (int i = 0; i < length - 4; i++) {
            nums[i] = ((int) (Math.random() * 100000));
        }
        nums[length - 1] = 15;
        nums[length - 2] = 11;
        nums[length - 3] = 7;
        nums[length - 4] = 2;

        int target = 9;

        long start1 = System.nanoTime();
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));
        long end1 = System.nanoTime() - start1;
        System.out.println("HashMap solution time: " + end1 + "ns.");

        long start2 = System.nanoTime();
        System.out.println(Arrays.toString(twoSumBruteForce(nums, target)));
        long end2 = System.nanoTime() - start2;
        System.out.println("BruteForce solution time: " + end2 + "ns.");
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
