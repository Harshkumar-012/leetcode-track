class Solution {
public:
    vector<int> scoreValidator(vector<string>& events) {
        int score = 0;
        int counter = 0;
        int n = events.size();
        for(int i=0;i<n;i++){
            if(counter==10){
                break;
            }
            else if(events[i]=="W"){
                counter++;
            }
            else if(events[i]=="WD"){
                score++;
            }
            else if(events[i]=="NB"){
                score++;
            }
            else if(events[i]=="1")score++;
            else if(events[i]=="2")score+=2;
            else if(events[i]=="3")score+=3;
            else if(events[i]=="4")score+=4;
            else if(events[i]=="5")score+=5;
            else if(events[i]=="6")score+=6;
        }
        return {score,counter};
    }
};