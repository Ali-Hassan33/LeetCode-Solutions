class Solution {
    public int diagonalSum(int[][] mat) {
    int result=0;
    for(int i=0; i<mat.length; i++){
        result+=mat[i][i];
    
    if(mat.length-1-i!=i){
        result+=mat[i][mat.length-1-i];
    }}
    return result;
}}
