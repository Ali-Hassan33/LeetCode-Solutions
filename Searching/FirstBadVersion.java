public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0,end=n,r=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                r=mid;
                end=mid-1;}
        else 
            start=mid+1;
        }
    return r;
    }
        
}
