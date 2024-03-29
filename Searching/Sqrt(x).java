class Solution {
    public int mySqrt(int x) {
// for better understanding see thiscode but it wouldn't be run on leetcode
// for that go to line 22
//     int start=1;
//     int end=x;
//     int ans=0;
//     while(start<=end){
//         int mid=start+(end-start)/2;
//         if(mid*mid==x)
//         return mid;
//         else if(mid*mid<=x){
//             // In that case we'll guess our potential ans bcz we know that sq.root of any number is always less than it and increase our search space
//         ans=mid;
//         start=mid+1;
//         }
//         else
//         end=mid-1;
//     }
//     return ans;
    
// Note: in the below code the only change is in the format of met condition.We move mid from left towards right side to prevent integers out of bound error. 
    int start=1,end=x,ans=0,mid;
    while(start<=end){
         mid=start+(end-start)/2;
        if(mid*mid==x)
        return mid;
        else if(mid<=x/mid){
            start=mid+1;
            ans=mid;
        }
        else 
            end=mid-1;
    }
        return ans;
    }
}
