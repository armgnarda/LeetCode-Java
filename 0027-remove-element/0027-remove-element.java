class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Dizide kalan elemanların sayısını tutar
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Val olmayan elemanları başa taşır
                k++;
            }
        }
        
        return k;
    }
}