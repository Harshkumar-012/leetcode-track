class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        maxcount = count;
        for(int i=k;i<n;i++){
            char ch = s.charAt(i);
            char check = s.charAt(i-k);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            if(check=='a'||check=='e'||check=='i'||check=='o'||check=='u'){
                count--;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;



    }
}