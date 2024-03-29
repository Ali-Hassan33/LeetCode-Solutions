class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<32; i++){
            int sum=0;
        for(int j=0; j<nums.length; j++){
            int mask=nums[j]>>i;//bcz in right shift right most 1 get discarded.
            if((mask&1)==1) // we are doing mask & 1 to deal mask as bits other it 
                // would be treated as decimal;
                sum++;
            sum%=3;
        }
            if(sum!=0)
                result|=sum<<i;
        }
        return result;
    }
}
