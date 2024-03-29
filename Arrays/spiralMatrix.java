class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> result=new ArrayList<>();
        int dir=0;
    int rS=0, rE=matrix.length-1, cS=0, cE=matrix[0].length-1;
    while(rS<=rE && cS<=cE){
    if(dir==0){
        for(int i=cS; i<=cE; i++){
            result.add(matrix[rS][i]);
        }
        rS++;}
        else if(dir==1){
        for(int i=rS; i<=rE; i++){
            result.add(matrix[i][cE]);
        }
        cE--;}
        else if(dir==2){
        for(int i=cE; i>=cS; i--){
            result.add(matrix[rE][i]);
        }
        rE--;}
        else{
        for(int i=rE; i>=rS; i--){
            result.add(matrix[i][cS]);
        }
        cS++;
    }
     dir = (dir + 1) % 4;}
// you might be wondering that why we declare a variable "dir"
// Reason is that if all the loops iterate and  the constructor reaches at end 
// and still there are elements remaining to be added in the "result" then dir will 
// tell that whether we will iterate through all the loops again or only through      the specific loop.
        return result;
    }
}
