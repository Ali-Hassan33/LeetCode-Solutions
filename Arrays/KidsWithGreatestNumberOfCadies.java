class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> ans=new ArrayList<>();
    int max=-1;
    for(int i=0; i<candies.length; i++){
        max=Math.max(max,candies[i]);
    }
    for(int i=0; i<candies.length; i++){
        if(ans.add(max<=candies[i]+extraCandies));// Whether it will be going to true or false         it will store the ans int boolean format in the ans array.
    }
        return ans;
    }
    }
