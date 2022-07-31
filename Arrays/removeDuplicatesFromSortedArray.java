class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i]; 
            }
         i++;
}
   return j+1;// as first element of every array will be unique that's why at end we are adding 1
    }
}
