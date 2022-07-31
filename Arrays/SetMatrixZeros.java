class Solution {
    public void setZeroes(int[][] mat) {
    ArrayList<Integer> rows=new ArrayList<>();
    ArrayList<Integer> cols=new ArrayList<>();
    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[i].length; j++){
            if(mat[i][j]==0){
                rows.add(i);
                cols.add(j);
            }
        }
    }
    for(int i=0; i<rows.size(); i++){
        for(int j=0; j<mat[0].length; j++){
            mat[rows.get(i)][j]=0;
        }
    }
    for(int i=0; i<cols.size(); i++){
        for(int j=0; j<mat.length; j++){
            mat[j][cols.get(i)]=0;
        }
    }
    }
}
