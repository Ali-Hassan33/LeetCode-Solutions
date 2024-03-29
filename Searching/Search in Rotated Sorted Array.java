class Solution {
   public int search(int[] arr,int target){
//                                 e
//                                 s      
//              [ 4 , 5 , 6 , 7 ,  0 , 1 , 2]
//                0   1   2   3    4   5   6
        int start=0;
        int end=arr.length-1;
        while(start<end){
        int mid=start+(end-start)/2;
            if(arr[mid]>arr[end])
// because in a sorted array, element at the end is always greater than the middle element but  if  mid value is greater than the end  then there will be some values existing at the right of mid which are smaller.So, we'll shift our start pointer. 
                start=mid+1;       
            else
                end=mid;// As, we are searching for the pivot(smallest value) and if end is greater than mid thus elements at the left of end are smaller.
}
// If the pivot is found,  we just have to  search for the target then.
// now we are just setting up the normal binary search for that we have to take one side of array means sorted e.g. here 4,5,6,7(left sorted side) and 0,1,2(right sorted side)            
        int left=start;
        start=0;
        end=arr.length-1;
        if(target>=arr[left] && target<=arr[end]) // means if target is lying at the right sorted side then we don't have to change anything.
            start=left;
        else
            end=left-1;
// if we have caught at which sorted side the target is present we can now simply start our normal binary search.(here at right side).i.e from 0.
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]>target)
            end=mid-1;
        else if(arr[mid]<target)
            start=mid+1;
        else
            return mid;
    }
        return -1;
               }
        }
