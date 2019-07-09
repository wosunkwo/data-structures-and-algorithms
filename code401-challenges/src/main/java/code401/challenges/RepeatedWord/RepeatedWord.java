package code401.challenges.RepeatedWord;

import java.util.HashMap;

public class RepeatedWord {

    public String occurMoreThanOnce(String sentence){
        String[] wordsArr = sentence.split("\\W+");
        HashMap<String, Integer> occuranceMap = new HashMap<>();
        int dummyCnt = 0;
        for(int i=0; i<wordsArr.length; i++){
            if(occuranceMap.get(wordsArr[i]) != null){
                return wordsArr[i];
            }else{
                occuranceMap.put(wordsArr[i].toLowerCase(), dummyCnt);
                dummyCnt++;
            }
        }
        return null;
    }
}
