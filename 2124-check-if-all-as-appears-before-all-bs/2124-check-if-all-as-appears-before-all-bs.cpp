class Solution {
public:
    bool checkString(string s) {
        vector<int>seen;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s[i] == 'a'){
                seen.push_back(i);
            }
        }
        int m = seen.size();
        for(int i=0;i<m;i++){
            if(i!=seen[i]){
                return false;
            }
        }
       return true;
    }
};