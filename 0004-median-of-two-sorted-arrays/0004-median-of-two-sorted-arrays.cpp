class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        vector<double>merge;
        for(auto val : nums1){
            merge.push_back(val);
        }
        for(auto val : nums2){
            merge.push_back(val);
        }
        sort(merge.begin(),merge.end());
        int x = merge.size();
        if(x%2==0){
            double ans = (merge[x/2]+merge[(x/2)-1])/2;
            return ans;
        }
        else {
            double ans = merge[x/2];
            return ans;
        }
        return {};
    }
};