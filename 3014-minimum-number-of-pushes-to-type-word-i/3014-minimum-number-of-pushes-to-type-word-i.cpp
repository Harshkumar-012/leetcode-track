class Solution {
public:
    int minimumPushes(string word) {
        int n = word.length();
        int ans = 0;
        int check = n;
        if(check<=8){
            ans = check;
        }
        else if(check>8 && check<=16){
            ans = 8+((check-8)*2);
        }
        else if(check>16 && check<=24){
            ans = 8+((check-((check-16)+8))*2) + ((check-16)*3);
        }
        else {
            ans = 8+((check-(check-16)-8)*2) + ((check-(check-16)-8))*3 + ((check-24)*4);
        }
        return ans;
        
    }
};