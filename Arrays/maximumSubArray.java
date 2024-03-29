class Solution {
    public int maxSubArray(int[] nums) {
    int maxSoFar=nums[0];
    int maxHere=nums[0];
    for(int i=1; i<nums.length; i++){
        maxHere=Math.max(nums[i]+maxHere,nums[i]);
        maxSoFar=Math.max(maxHere,maxSoFar);
    }
    return maxSoFar;
    }
}
