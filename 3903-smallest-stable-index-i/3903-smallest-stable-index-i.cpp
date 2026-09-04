class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int maxele = INT_MIN;
        int n = nums.size();
        for(int i=0;i<n;i++){
            int maxele = max(maxele,nums[i]);
            int minel = *min_element(nums.begin()+i,nums.end());
            int calc = maxele-minel;
            if(calc<=k){
                return i;
            }
        }
        return -1;
    }
};