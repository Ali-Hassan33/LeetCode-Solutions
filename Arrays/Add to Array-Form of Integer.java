class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    ArrayList<Integer> result=new ArrayList<>();
    for(int i=num.length-1; i>=0; i--){
        result.add((num[i]+k)%10);
        k=(k+num[i])/10;
    }
        while(k>0){
            result.add(k%10);
            k/=10;
        }
        Collections.reverse(result);
        return result;
    }
    }
