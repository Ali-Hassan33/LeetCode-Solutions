class Solution {
    public int countPrimes(int n) {
        boolean []arr=new boolean[n];
        int count=0;
        // Since Prime numbers starts from 2
        for(int i=2; i<n; i++){
            if(arr[i]==false)
            count++;
            for(int j=2; i*j<n; j++){ // since i*1=i therefore we start from 2 because its state(true or false) has already been decided by the outer loop.
                arr[i*j]=true;
            }
        }
        return count;
    }
}
