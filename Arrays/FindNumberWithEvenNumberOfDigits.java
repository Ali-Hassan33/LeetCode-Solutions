class Solution {
    public int findNumbers(int[] nums) {
        // int count=0;
        // for(int i=0; i<nums.length; i++){
        //     int digits=0;
        // digits=(int)Math.log10(nums[i])+1;
        // if(digits%2==0){
        //     count++;
        // }
        // }
        // return count++;
   int count=0;
        for(int i=0; i<nums.length; i++){
        int digits=0;
            while(nums[i]>0){
                nums[i]/=10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}
