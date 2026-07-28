class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>seen;
        for(int val : nums1){
            seen[val]++;
        }
        vector<int>res;
        for(int val : nums2){
            if(seen[val]>0){
                res.push_back(val);
                seen[val]--;
            }
        }
        return res;
    }
};