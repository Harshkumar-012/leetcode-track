import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int val : nums){
            seen.add(val);
        }
        List<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int st = nums[0];
        int ed = nums[n-1];

        for(int i=st;i<=ed;i++){
            if(!seen.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}