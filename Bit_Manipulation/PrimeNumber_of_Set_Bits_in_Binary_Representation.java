class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
    for(int i=left; i<=right; i++){
       if(isPrime(countSetBits(i))==true)
       result++;
   }
        return result;
    }
    //      Kernighans Algorithm
    static int countSetBits(int n){
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }
    static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
        }
  
