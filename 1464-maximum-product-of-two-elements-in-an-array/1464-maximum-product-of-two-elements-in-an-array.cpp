class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int fir = nums[n-1]-1;
        int sec = nums[n-2]-1;
        return fir*sec;
    }
};



























        // int ans = INT_MIN;
        // int n = nums.size();
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         ans = max(ans,(nums[i]-1)*(nums[j]-1));
        //     }
        // }
        // return ans;