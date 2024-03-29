class Solution {
    public boolean checkIfExist(int[] arr) {
            Arrays.sort(arr);
            for(int i=0; i<arr.length; i++){
                if(binarySearch(arr,arr[i]*2,i))
                return true;
                }
                return false;
                }
        static boolean binarySearch(int[] arr,int target,int i){
            int start=0,end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target && mid!=i)
                    return true;
            else if(arr[mid]>target)
                    end=mid-1;
            else 
                    start=mid+1;
            }
            return false;
             }
        
}
