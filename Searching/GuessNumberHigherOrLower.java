public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int start=0;
       int end=n;
       while(true){
           int ourPick=start+(end-start)/2;
           int ourGuess=guess(ourPick);
        if(ourGuess==0)
            return ourPick;
    else if(ourGuess>0)
            start=ourPick+1;
    else 
            end=ourPick-1;
       }
    }
}
