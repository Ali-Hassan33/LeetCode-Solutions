class Solution {
    public int[] countBits(int n) {
        int [] arr=new int[n+1];// result will be stored in this.
        arr[0]=0;
            n=0;//As,there is now no use of given variable n , so we'll use it 😜
        int u=1;// it will give us the current decimal number.
        for(int i=1; i<arr.length; i++){// starting from 1 bcz we have dealed with 0 above.
        int count=0;
            n=u;
        while(n!=0){
        if((n&1)==1)
              count++;
              n>>=1;  
        }
            u++;
            arr[i]=count;
    }
        return arr;
    }
}
