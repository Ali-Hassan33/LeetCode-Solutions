class Solution {
    public int[] sumZero(int n) {
// suppose result={0,0,0,0,0};
    int[] result=new int[n];
        //Now, we are iterating from start to mid.
    for(int i=0; i<n/2; i++){
        result[i]=n-i;// putting values at every index from the starting position.
