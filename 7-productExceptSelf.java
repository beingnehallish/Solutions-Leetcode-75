class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num[]=new int[nums.length];
        int pro=1,zeros=0,index=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            zeros++;
            index=i;
          }
          else
          pro*=nums[i];
        }
        if(zeros==0){
            for(int i=0;i<nums.length;i++)
               num[i]=pro/nums[i];
        }    
        else if(zeros==1)
          num[index]=pro;
        return num;
  }
}
    
    
    
