class Solution {
    public void sortColors(int[] nums) {
    int[] count={0,0,0};// we create an array of size three bcz there are only three colors.
    for(int i=0; i<nums.length; i++){
        count[nums[i]]++;  //  the elements of nums(from 0 till end) will be the 'count' array indexes and incrementing that particular index by one.
    }
        int k=0;// we want to put each value in a new index to make the sort in ascending order.
    for(int i=0; i<count.length; i++){
        for(int j=0; j<count[i]; j++){
            nums[k]=i;
            k++;
            // here "i" will help us to put the repeative numbers in correct order(ascending).
        }
    }
    }
}
