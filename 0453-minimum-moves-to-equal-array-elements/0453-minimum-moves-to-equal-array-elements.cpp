class Solution {
public:
    int minMoves(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        int minele = *min_element(nums.begin(),nums.end());
        for(int i=0;i<n;i++){
            if(minele<nums[i]){
                ans+=nums[i]-minele;
            }
        }
        return ans;
    }
};