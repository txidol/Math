package Algorithms;

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

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result =twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
