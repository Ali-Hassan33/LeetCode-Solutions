class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                int sum=target-nums[i];
            if(sum==nums[j] && i!=j)
                return new int[]{i,j};
            }
        }
            return new int[]{-1,-1};
             }
         }
