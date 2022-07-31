class Solution {
    public int oddCells(int m, int n, int[][] indices) {
    int[] rows=new int[m];
    int[] cols=new int[n];
    for(int i=0; i<indices.length; i++){
        rows[indices[i][0]]+=1;
        cols[indices[i][1]]+=1;
    }
    int count=0;
    for(int r=0; r<m; r++){
        for(int c=0; c<n; c++){
            if((rows[r]+cols[c])%2!=0){
                count++;
            }
        }
        }
    return count;
    }}
