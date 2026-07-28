class Solution {
public:
    bool isHappy(int n) {
        while(n!=1 && n!=4){
            int num = n;
            int check = 0;
            while(num != 0){
                int ld = num%10;
                check += ld*ld;
                num/=10;
            }
   
            n = check;
    } 
    if(n==1)  return true;   
        return false;
    }
};