class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
// we are taking modulous bcz e.g. nums=[-1] & k=2
// In this case k=0 bcz we there is no need for any function for this given statement.
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
            
        }
        static void reverse(int[] nums,int start,int end){
            while(start<end){
                int temp=nums[end];
                nums[end]=nums[start];
                nums[start]=temp;
                start++;
                end--;
            }
        }
    }
