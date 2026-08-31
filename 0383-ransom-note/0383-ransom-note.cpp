class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char,int>seen;
        for(char ch : magazine){
            seen[ch]++;
        }
        for(char ch : ransomNote){
            if(seen[ch]==0){
                return false;
            }
            seen[ch]--;
        }
        return true; 
    }
};