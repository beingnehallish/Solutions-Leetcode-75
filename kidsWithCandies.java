//KIDS WITH CANDIES

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> ans=new ArrayList<Boolean>();
        for(int candy:candies){
            if(candy>max)
                max=candy;
        }
        for(int candy:candies)
            ans.add(candy+extraCandies>=max);
        return ans;

    }
}
