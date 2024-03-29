class Solution {
    public int[] twoSum(int[] nums, int target) {
// With the help of two pointers
    // int left=0,right=nums.length-1;
    // while(left<right){
    //     int sum=nums[left]+nums[right];
    //     if(sum==target)
    //     return new int[]{left+1,right+1};
    // else if(sum<target)
    //     left++;
    // else 
    //     right--;
    // }
    // return new int[]{-1,-1};

    // Using binary search
// Note:
    // we'll take an element of array from right towards left (one value at a time) and subtract it with target.e.g. if target=6 and arrayValue(at that index)=4 then remainder would be 2
// now we just simply have to fillup the deficiency of target value which is of 2
//bcz remainder had already filled up the remaining numbers.
    for(int i=nums.length-1; i>=0; i--){
        int remainder=target-nums[i];
            int s=binarySearch(nums,i,remainder);
        if(s!=Integer.MAX_VALUE)
        return new int[]{s+1,i+1};
    }
    return new int[]{0,0};    
        }
    static int binarySearch(int[] nums,int end, int remainder){
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
        if(nums[mid]<remainder)
            start=mid+1;
        else if(nums[mid]>remainder)
            end=mid-1;
        else 
            return mid;
    }
        return Integer.MAX_VALUE;
    }}

