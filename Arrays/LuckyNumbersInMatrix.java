class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
    ArrayList<Integer> result=new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int min=Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean decision=true;
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][minIndex]<matrix[j][minIndex]){
                    decision=false;
                    break;
                }
            }
            if(decision)
                result.add(matrix[i][minIndex]);
        }
        return result;
    }
        }
      
