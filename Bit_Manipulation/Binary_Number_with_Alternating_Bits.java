class Solution {
    public boolean hasAlternatingBits(int n) {
        int n1=n>>1;
        int xor=n^n1;
        /*
         if after xoring all the bits don't become 1 then it means bits are 
           not alternating. 
           now ,we will make a form of 0s(excluding the left most bit) of length Xor result by adding 1 to it and remeber if 10000... does not become it means bit are 
           not alternating and we will check it by performing & operation .
           */
           int a=xor+1;
           if((a&xor)==0) return true;
            return false;
    }
}
