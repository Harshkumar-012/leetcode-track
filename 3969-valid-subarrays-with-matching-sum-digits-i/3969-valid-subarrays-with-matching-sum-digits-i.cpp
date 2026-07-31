class Solution {
public:
    int countValidSubarrays(vector<int>& nums, int x) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            long long sum = 0;
            for(int j=i;j<n;j++){   
                sum+=nums[j];
                if(sum%10 == x){ 
                    long long check = sum; 
                    while(check>=10){
                        check/=10;
                    }
                    if(check == x){
                        ans++;
                    }      
                }                
            }
        }
        return ans;
    }
};