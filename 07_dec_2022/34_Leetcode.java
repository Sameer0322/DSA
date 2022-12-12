class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] result = {-1,-1};
       int l=0;
       int h=nums.length-1;

       while(l<=h){
           int mid= (l+h)/2;
           if(nums[mid]== target){
               result[0]=mid;
               h = mid-1;
           }
           else if(nums[mid]<target){
               l=mid+1;
           }
           else{
               h=mid-1;
           }
        }

        l=0;
        h=nums.length-1;
        while(l<=h){
           int mid= (l+h)/2;
           if(nums[mid]== target){
               result[1]=mid;
               l = mid+1;
           }
           else if(nums[mid]<target){
               l=mid+1;
           }
           else{
               h=mid-1;
           }
        }

        return result;
    }
}