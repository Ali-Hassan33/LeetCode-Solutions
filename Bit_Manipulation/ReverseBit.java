public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    int result=0,i=0;
    while(i!=32){
        result<<=1;// to make space for upcoming bit.
        if((n&1)==1)
        result++;
        n>>=1;
        i++;
    }
    return result;
        }
 }
