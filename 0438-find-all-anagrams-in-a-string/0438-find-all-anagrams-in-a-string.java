class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] pchar = p.toCharArray();
        Arrays.sort(pchar);
        String charp = new String(pchar);
        List<Integer>ans = new ArrayList<>();        
        int n = s.length();
        int m = p.length();
        for(int i=0;i<=n-m;i++){
            String check = s.substring(i,i+m);
            char[] schar = check.toCharArray();
            Arrays.sort(schar);
            String chars = new String(schar);
            if(chars.equals(charp)){
                ans.add(i);
            }
        }   
    return ans;
    }
}