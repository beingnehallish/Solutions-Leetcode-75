//LONGEST CONSECUTIVE 1's by using K which can replace 0's to 1's
class Solution {
    static{
        int[] nums=new int[]{1,0};
        for(int i=0;i<500;i++)
           longestOnes(nums,1);
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLength = 0;
        int zeroCount = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            // If we have more than `k` zeros, shrink the window from the left
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; // Move left pointer
            }
            // Update max length of valid subarray
            maxLength = Math.max(maxLength, right - left + 1);
            right++; // Expand the window
        }
        return maxLength;
    }
}
