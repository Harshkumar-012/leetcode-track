class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>seen = new HashSet<>();
        HashSet<Integer>seen1 = new HashSet<>();
        for(int val : nums1){
            seen.add(val);
        }
        int i=0;
        
        for(int val : nums2){
            if(seen.contains(val)){
                seen1.add(val);
                
            }
        }
        int[] ans = new int[seen1.size()];
        int count=0;
        for(int val : seen1){
            ans[count] = val;
            count++;
        }
        return ans;
    }
}