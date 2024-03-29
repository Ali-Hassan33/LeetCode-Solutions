class Solution {
    public boolean isHappy(int n) {
    int slow=n;
    int fast=getNext(n);
// if fast==1 , it means the given number is a happy one.
// if slow==fast , it means there is a cycle found.    
    while(fast!=1 && fast!=slow){
        slow=getNext(slow);
        fast=getNext(getNext(fast));
    }
    return fast==1;
}
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            n/=10;
            sum+=r*r;
        }
        return sum;
    }
    }
