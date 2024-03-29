class Solution {
    public int maximumPopulation(int[][] logs) {
    int[] maxPop=new int[101];
    for(int i=0; i<logs.length; i++){
        maxPop[logs[i][0]-1950]++;
        maxPop[logs[i][1]-1950]--;
// To avoid the count of death year we put -- in the 6th line;
    }
    for(int i=1; i<maxPop.length; i++){
    maxPop[i]+=maxPop[i-1];
}
        int maxValue=0;
        int maxYear=0;
    for(int i=0; i<maxPop.length; i++){
        if(maxValue<maxPop[i]){
            maxValue=maxPop[i];
            maxYear=i+1950;
        }
    }
        return maxYear;
    }
    }
