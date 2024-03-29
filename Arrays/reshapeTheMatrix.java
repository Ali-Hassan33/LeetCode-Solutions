class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int[][] result=new int[r][c];
    int a=mat.length;
    int b=mat[0].length;
    if(r*c!=a*b){
        return mat;
        // if we don't write this condition then some elements will left empty in the result              array because in question its written that The reshaped matrix should be filled with            all the elements of the original matrix.
    }
    int t=0;
    for(int i=0; i<a;i++){
        for(int j=0; j<b; j++){
            result[t/c][t%c]=mat[i][j];
            t++;
        }
    }
    return result;
    }
}
