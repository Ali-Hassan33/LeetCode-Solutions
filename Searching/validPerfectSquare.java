class Solution {
    public boolean isPerfectSquare(int num) {
// because "1" itself is a perfect square we can't start from 0 
// e.g if we have to check for "1" then for that mid would be 0 and we can divide any num with 0 .it will cause error at line 10.
       int start=1,end=num,mid,ans;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==num)
            return true;
        else if(mid<=num/mid){// we minimize our distance hehe
            start=mid+1;
            ans=mid;
        }
        else 
            end=mid-1;
        }
        return false;
    }
}
