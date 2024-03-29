class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    static int helper(int[]nums , int index , int currXor){
        if(index==nums.length)
        return currXor;
        int withElements=helper(nums,index+1,nums[index]^currXor);
        int withoutElements=helper(nums,index+1,currXor);
        return withElements+withoutElements;
    }
}
