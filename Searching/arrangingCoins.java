class Solution {
    public int arrangeCoins(int n) {
    long start=0;
    long end=n;
    while(start<=end){
        long mid=start+(end-start)/2; // here mid will tell us about stairs.
    if(mid*(mid+1)/2==n)
// by applying this formula: we can use mid as number of coins .
// because it give us the series of all the nums, so we can imagine these numbers as coins .
// In short, if the sum of nums(mid) at that point in time matches n(given coins), it means we have found the perfect no. of stairs in which the all the coins fills each of the case(of that stair).

    return (int)mid;
    else if(mid*(mid+1)/2 >n)
// if the sum of numbers(formula) exceeds n(given coins), it means we have to reduce our stairs(which is mid here) because coins are not enough for all the stairs case.
    end=mid-1;
    else
// if the sum of numbers(formula) doesn't exceeds n(given coins), it means we have to increase our stairs(which is mid here) because coins are ample(more than necessary) for all the stairs case.
    start=mid+1;
    }
    return (int)end;
  
    }
}




// n=total coins
    // int row=1;
    // while(row<=n){
    //     n=n-row; // here we we are using "row" as 'used coins'.
    //     row++;// 
    // }
    // return row-1;    
 
