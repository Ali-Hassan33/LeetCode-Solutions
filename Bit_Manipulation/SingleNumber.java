class Solution {
    public int singleNumber(int[] nums) {
        int result=0; // since 0 in Xor doesn't affect the other number
        for(int n: nums)
            result^=n;
        return result;
    }
}
