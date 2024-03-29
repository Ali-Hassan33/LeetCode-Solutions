class Solution {
    public int findMin(int[] arr) {
    int start=0,end=arr.length-1;
        if(arr[start]<=arr[end]) //[1,2,3,4,5] 
            return arr[start];//arr[end];
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]) //[3,4,5,1,2] 
            return arr[mid+1];
   else if(arr[mid]<arr[mid-1])// [4,5,1,2,3]
            return arr[mid];
   else if(arr[mid]>arr[start] && arr[mid]>arr[end]) // [2,3,4,5,1] 
            start=mid+1; 
    else
            end=mid-1;
    }
        return -1;
}
      }
    
