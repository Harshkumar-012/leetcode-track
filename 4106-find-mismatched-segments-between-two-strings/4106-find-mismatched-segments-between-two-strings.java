class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>>ans = new ArrayList<>();
        int n = s1.length();
        StringBuilder check1 = new StringBuilder();
        StringBuilder check2 = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                check1.append(s1.charAt(i));
                check2.append(s2.charAt(i));
            }
            else{
                if(check1.length()==0){
                    continue;
                }
                List<String>seen = new ArrayList<>();
                seen.add(check1.toString());
                seen.add(check2.toString());
                ans.add(seen);
                check1.setLength(0);
                check2.setLength(0);
            }
        }
        if(check1.length()>0){
            List<String>seen = new ArrayList<>();
            seen.add(check1.toString());
            seen.add(check2.toString());
            ans.add(seen);
        }
        return ans;
    }
}