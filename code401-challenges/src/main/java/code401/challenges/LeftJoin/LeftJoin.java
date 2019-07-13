package code401.challenges.LeftJoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    public ArrayList<String> leftJoinMap(HashMap<String, String> firstHash, HashMap<String, String> secondHash){
        //an arraylist to  store my resulting keys and values
        ArrayList<String > resultArrList = new ArrayList<>();
        //a string array to store each row of my left join
        String[] tempArr = new String[3];
        //loop through the first hashset and add the key and the value to my array
        for(Map.Entry<String, String> entry : firstHash.entrySet()){
            tempArr[0] = entry.getKey();
            tempArr[1] = entry.getValue();
            tempArr[2] = null;
            //if the key in the firsthashset is present in the second hashset that means we can do a join here
            //add the value in the secondhashset to the array
            String secondHashValue = secondHash.get(entry.getKey());
            if(secondHashValue != null){
                tempArr[2] = secondHashValue;
            }
            //convert that array to a string and append it to the arraylist
            resultArrList.add(Arrays.toString(tempArr));
        }
        return resultArrList;
    }

    public static void main(String[] args){
        LeftJoin test = new LeftJoin();
        HashMap<String, String> firstHash = new HashMap<>();
        HashMap<String, String> secondHash = new HashMap<>();

        firstHash.put("will", "nice");
        firstHash.put("james", "bad");
        firstHash.put("tobi", "good");
        firstHash.put("jamiu", "angry");

        secondHash.put("jerry", "25");
        secondHash.put("james", "19");
        secondHash.put("will", "22");
        secondHash.put("jamiu", "24");

        System.out.println((test.leftJoinMap(firstHash, secondHash)).toString());

    }
}
