class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        
        int minDiff = Integer.MAX_VALUE;
        
        
        minDiff = Math.min(minDiff, nums[n - 1] - nums[3]); 
        minDiff = Math.min(minDiff, nums[n - 2] - nums[2]); 
        minDiff = Math.min(minDiff, nums[n - 3] - nums[1]); 
        minDiff = Math.min(minDiff, nums[n - 4] - nums[0]); 
        
        return minDiff;
    }
}