class Solution {
    public int removeDuplicates(int[] nums) {
        // Array boş ise return 0
		if (nums.length == 0) return 0;
		
		int i = 0;
		
		for(int j = 1; j < nums.length; j++) {
			// benzersiz öğe bulunduğunda
			if (nums[j] != nums[j-1]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
    }
}