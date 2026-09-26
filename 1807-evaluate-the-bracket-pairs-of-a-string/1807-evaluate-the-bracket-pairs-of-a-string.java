class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String>seen = new HashMap<>();
        int n = knowledge.size();
        for(int i=0;i<n;i++){
           List<String>val = knowledge.get(i);
            seen.put(val.get(0),val.get(1));
        }
        StringBuilder ans = new StringBuilder();
        int m = s.length();
        for(int i=0;i<m;i++){
            int count = 0;
            if(s.charAt(i)=='('){
                for(int j=i+1;;j++){
                    if(s.charAt(j)==')'){
                        count = j;
                        break;
                    }
                }
                ans.append(seen.getOrDefault(s.substring(i+1,count),"?"));
                i = count;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}