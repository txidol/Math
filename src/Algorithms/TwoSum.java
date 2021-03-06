package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result =null;
        for1:
        for(int i =0; i<size; ++i){
            for(int j=i+1 ; j<size;j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i,j};
                    break for1;
                }
            }
        }
        return result;
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result =twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
