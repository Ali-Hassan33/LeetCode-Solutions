class Solution {
    public boolean checkIfPangram(String sentence) {
    boolean[] ch=new boolean[26];
//  if we haven't store any element in the array of type boolean
// by default every element will be false.
  for(int i=0; i<sentence.length(); i++){
      ch[sentence.charAt(i)-97]=true;
  }
    for(boolean i:ch){
        if(i==false)
        return false;
        }
        return true;
    }
    }
