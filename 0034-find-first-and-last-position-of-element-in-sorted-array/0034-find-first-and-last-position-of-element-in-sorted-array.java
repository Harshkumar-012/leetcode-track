class Solution {
    public int[] searchRange(int[] nums, int target) {
        int stpos = -1;
        int lastpos = -1;
        int st=0;
        int n = nums.length;
        int ed = n-1;
        while(ed>=st){
            int mid = st+(ed-st)/2;
            if(nums[mid]==target){
                stpos = mid;
                ed = mid-1;
            }
            else if(nums[mid]<target){
                st = mid+1;;
            }
            else{
                ed = mid-1;
            }
        }
        st = 0;
        ed = n-1;
        while(ed>=st){
            int mid = st+(ed-st)/2;
            if(nums[mid]==target){
                lastpos = mid;
                st = mid+1;
            }
            else if(nums[mid]<target){
                st = mid+1;          
            }  
            else{
                ed = mid-1;
            }        
        }
        return new int[]{stpos,lastpos}; 
    }
}