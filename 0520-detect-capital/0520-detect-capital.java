class Solution {
    public boolean detectCapitalUse(String word) {
        int check = 0;
        for(char val : word.toCharArray()){
            if(Character.isUpperCase(val)){
                check++;
            }
        }
        if(check == 0){
            return true;
        }
        else if(check==1 && Character.isUpperCase(word.charAt(0)) ){
            return true;
        }
        else if(check==word.length()){
            return true;
        }
        return false;
    }
}