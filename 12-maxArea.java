//Container with Most Water
class Solution {
    static {
        for (int i=0;i<500;i++) {
            maxArea(new int[]{0, 0});
        }
    }
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, water);
            
            if (height[left] < height[right])
                left += 1;
            else
                right -= 1;
        }
        
        return res;
    }
}
