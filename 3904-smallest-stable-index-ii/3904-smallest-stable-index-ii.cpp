class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n = nums.size();
        int maxele = INT_MIN;
        int minele = INT_MAX;
        vector<int>check1;
        vector<int>check2;
        for(int i=0;i<n;i++){
            maxele = max(maxele,nums[i]);
            check2.push_back(maxele);
        }
        minele = nums[n-1];
        check1.push_back(minele);
        for(int i=n-2;i>=0;i--){
            minele = min(minele,nums[i]);
            check1.push_back(minele);
            // check1[i] = min(nums[i],check1[i+1]);
        }
        reverse(check1.begin(),check1.end());
        for(int i=0;i<n;i++){
            if((check2[i]-check1[i])<=k){
                return i;
            }
        }
        return -1;
    }
};