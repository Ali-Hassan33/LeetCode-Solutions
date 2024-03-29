class Solution {
 public List<Integer> grayCode(int n) {
     List<Integer> result=new ArrayList<>();
     result.add(0);
     for(int i=0; i<n; i++){
         for(int j=result.size()-1; j>=0; j--){
        // j will help us to make first and last integer to differ by one bit.
        result.add(result.get(j) | 1<<i);        
         }
// note: "i" used in right shift opeator is a proved method means it will definitely provides that no. of zeros which we needed at that time so don't waste time in it.      
 }
          return result;
 }
 }
