class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1arr = s1.toCharArray();
        Arrays.sort(s1arr);
        String arr1 = new String(s1arr);
        int n = s2.length();
        int m = s1.length();
        for(int i=0;i<=n-m;i++){
           String check = s2.substring(i,i+m);
           char[] s2arr = check.toCharArray();
           Arrays.sort(s2arr);
           String arr2 = new String(s2arr);
           if(arr1.equals(arr2)){
            return true;
           }
        }
        return false;
    }
}