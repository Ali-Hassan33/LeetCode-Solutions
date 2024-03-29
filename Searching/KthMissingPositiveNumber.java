class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=arr[mid]-mid-1;
// "count" will tell us about the missing numbers from start till mid(at that point in time).
// we are also doing -1 to get rid of "0" because zero is nor positive or negative.
            if(count<k)
            start=mid+1;// because we haven't get all the missing items.
            else
            end=mid-1;
//Now, here comes two cases:
// 1. if count becomes equal to "k", it means from start till mid all missing values has been founded(at that point in time).So, why we need to put start pointer above(start=mid+1) and now you might be thinking that why we put end=mid-1?  Because,if we have founded all the missing items , we'll stop over search at end=mid and we are doing -1 to get rid of zero index.
        }   
        
        return end+k+1;//to tackle zero.
    }
}
