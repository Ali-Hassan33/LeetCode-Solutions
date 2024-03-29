class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            return arr[mid];
        else if(arr[mid]==arr[mid-1]){
                if(mid%2!=0)// means till here no reptition is broken.
                start=mid+1;
                else
                end=mid-2;}
//every particular  number which appears twice has its last (twice) value on odd index but if it is on an even index it means there must be some special/unique/single value present behind because last (twice) value of a particular number can only be on even index in such a case if the repetition of twice value has been broken somewhere behind. In that secnario what we'll do is just move the end pointer 2 steps behind the mid pointer.Otherwise move your search space to mid+1.
        else if(arr[mid]==arr[mid+1])
            if(mid%2==0)// means till here no repition is broken
                start=mid+2;
            else
                end=mid-1;}
//every particular  number which appears twice has its first (twice) value on even index but if it is on an odd index it means there must be some special/unique/single value present after mid because first (twice) value of a particular number can only be on odd index in such a case if the repetition of twice value has been broken somewhere after mid. In that secnario what we'll do is just move the start pointer 2 steps forward from the mid pointer.Otherwise move your search space to mid-1.
            return arr[end];//  or  arr[start]
    }
}
