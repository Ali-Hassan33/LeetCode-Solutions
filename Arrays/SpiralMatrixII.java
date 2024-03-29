class Solution {
    public int[][] generateMatrix(int n) {
                int [][] matrix=new int[n][n];
            int rS=0, rE=n-1, cS=0, cE=n-1 ,count=1,dir=0;
    while(rS<=rE && cS<=cE){
        if(dir==0){
        for(int i=cS; i<=cE; i++){
            matrix[rS][i]=count++;// first count previous value will be stored then                                     it will be updated
        }
        rS++;}
        else if(dir==1){
        for(int i=rS; i<=rE; i++){
            matrix[i][cE]=count++;
        }
        cE--;}
        else if(dir==2){
        for(int i=cE; i>=cS; i--){
            matrix[rE][i]=count++;
        }
        rE--;}
            else{
        for(int i=rE; i>=rS; i--){
            matrix[i][cS]=count++;}
        cS++;
    }
        dir=(dir+1)%4;
     }
        return matrix;    }
}
