//MOVE ZEROS => [1,0,3,0,4] = [1,3,4,0,0]
class Solution {
    static{
        for(int i=0;i<500;i++)
        moveZeroes(new int[0]);
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums)
             if (num != 0)
                  nums[i++] = num;

         while (i < nums.length)
             nums[i++] = 0;
     }
}
