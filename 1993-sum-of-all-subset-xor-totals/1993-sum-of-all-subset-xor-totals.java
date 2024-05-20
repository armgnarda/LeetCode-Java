class Solution {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        int numOfSubsets = 1 << n; // 2^n

        for (int i = 0; i < numOfSubsets; i++) {
            int currentXOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentXOR ^= nums[j];
                }
            }
            totalSum += currentXOR;
        }

        return totalSum;
    }
}