class Solution {
    public boolean search(int[] arr, int target) {
//                       s,e   
//      [2 , 5 , 6 , 0 , 0 , 1 , 2]  
//       0 , 1 , 2 , 3 , 4 , 5 , 6
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
            return true;}
         else if (arr[start]<arr[mid]){// if left side is sorted then,
            if(arr[start]>target || arr[mid]<target)
                start=mid+1; // sorry not lie here
            else
                end=mid-1;
        }
        else if(arr[start]>arr[mid]){  // if right side is sorted then,
            if(arr[mid]>target || arr[end]<target)
                end=mid-1; // sorry not lie here
            else
                start=mid+1;
        }
        else{
            start++;
        }}
        return false;
}
}
