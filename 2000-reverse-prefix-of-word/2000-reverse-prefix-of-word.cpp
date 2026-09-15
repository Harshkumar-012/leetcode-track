class Solution {
public:
    string reversePrefix(string word, char ch) {
        string ans = "";
        int a = 0;
        for(int i=0;i<word.length();i++){
            if(word[i]==ch && a<=0){
                ans+=word[i];
                reverse(ans.begin(),ans.end());
                a++;
            }
            else{
                ans+=word[i];
            }
        }
        return ans;
    }
};