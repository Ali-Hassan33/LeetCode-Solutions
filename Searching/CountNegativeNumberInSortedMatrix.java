class Solution {
    public int countNegatives(int[][] grid) {
         int result=0;
     for(int i=0;i<grid.length;i++)
        result+=binarySearch(grid[i]);// we'll check each element(here subarray) of array one by one.
        return result;
    }
    static int binarySearch(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
// note:we'll not update "start" when it will reach on first negative value.Becaue it is given that array is sorted in descending order and we get the first negative value at some index it means the remaining values will also be negative.
// zero is not a negative number so we are also including it.
        if(arr[mid]>=0)
        start=mid+1;
        else
        end=mid-1;
        }
// here we don't put -1 for array length because one negative value will be owned by "start" surely.
        return arr.length-start;
    }
}
