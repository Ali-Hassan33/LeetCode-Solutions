      int output[]={-1,-1};
        output[0]=search(nums,target,true);
        if(output[0]!=-1)
            output[1]=search(nums,target,false);
        return output;
        }
        static int search(int []nums, int target, boolean index){
        int start=0,end=nums.length-1,r=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
                start=mid+1;
        else if(nums[mid]>target)
                end=mid-1;
        else{
            r=mid;
            if(index)
            end=mid-1;
            else 
            start=mid+1;
        }
      }
       return r;     
        }
}
        
        
