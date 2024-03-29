class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0,bobTotal=0;
        for(int i:aliceSizes)
            aliceTotal+=i;
        for(int i:bobSizes)
            bobTotal+=i;
        int diff=(aliceTotal-bobTotal)/2;
// if it is negative it means that alice has less candies than bob .Therefore, bob has to give more no. of candies to alice in exchange. 
        for(int i:bobSizes)
            if(binarySearch(aliceSizes,diff+i))
            return new int[]{diff+i,i};
                return null;
        }
// if diff+i is "+",it means that if bob exchanges that ith candies ,bob himself  will have a deficiency of diff+i,and alice has to fulfill this so that they both have equal amount of candies.If alice would n't able to give him that no. of candies then bob will not give him that particular candy box because at the end candies distribution couldn't be equal than.
//        if we deep dive into this we will come at this point that diff(difference(e.g,-1) b/w no. of candies of both)+i(bob ith candybox)
//        means that if bob gives him the ith box of candy(e.g, 2) ,(diff=2-1="1") will alice be able to give him that candies(e.g.1)
//        so at the end they both would have same number total candies(means there will be no difference then).
// therefore, we'll than scan through alice array to know that if he is able to give that candy.
// Note: for binary Search array must be sorted
        static boolean binarySearch(int[]arr,int target){
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return true;
        else if(arr[mid]<target)
                start=mid+1;
        else 
                end=mid-1;
            }
        return false;
        }
}
