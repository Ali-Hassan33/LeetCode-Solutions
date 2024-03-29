class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i]==nums1[i-1]){// then ignore duplicates
                i++;
                continue;
            }
            else if(nums1[i]==nums2[j]){
                result.add(nums2[j]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])// because both arrays are sorted ,it means if one array is right now at some low value as compared to other array we need to move to the i pointer to further elements of that array.
                i++;
            else
                j++;
        }
        int[] arr=new int[result.size()];
        for(int p=0; p<arr.length; p++){
         arr[p]=result.get(p);
        }
                return arr;
        }
    }
