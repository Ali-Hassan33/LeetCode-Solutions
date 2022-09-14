class Solution {
    public String addBinary(String a, String b) {
    StringBuilder result=new StringBuilder();
    int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            carry=sum>1? 1:0;// maximum carry will always be 2.bcz max.bit can be 1.
            result.append(sum%2);
        }
        if(carry!=0) result.append(carry);
        return result.reverse().toString();
    }
}
