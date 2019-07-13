package code401.challenges.LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    LeftJoin classUnderTest = new LeftJoin();

    @Test
    public void happyPath(){
        HashMap<String, String> firstHash = new HashMap<>();
        HashMap<String, String> secondHash = new HashMap<>();

        firstHash.put("fond", "enamored");
        firstHash.put("wrath", "anger");
        firstHash.put("diligent", "employed");
        firstHash.put("outfit", "garb");

        secondHash.put("fond", "averse");
        secondHash.put("wrath", "delight");
        secondHash.put("diligent", "idle");
        secondHash.put("guide", "follow");

        String expectedOutput = "[[diligent, employed, idle], [outfit, garb, null], [wrath, anger, delight], [fond, enamored, averse]]";

        assertEquals(expectedOutput, classUnderTest.leftJoinMap(firstHash, secondHash).toString());

    }

    @Test
    public void edgePath(){
        HashMap<String, String> firstHash = new HashMap<>();
        HashMap<String, String> secondHash = new HashMap<>();

        firstHash.put("will", "nice");
        firstHash.put("james", "bad");
        firstHash.put("tobi", "good");
        firstHash.put("jamiu", "angry");

        secondHash.put("james", "19");

        String expectedOutput = "[[jamiu, angry, null], [tobi, good, null], [will, nice, null], [james, bad, 19]]";

        assertEquals(expectedOutput, classUnderTest.leftJoinMap(firstHash, secondHash).toString());

    }

    @Test
    public void failPath(){
        HashMap<String, String> firstHash = new HashMap<>();
        HashMap<String, String> secondHash = new HashMap<>();

        String expectedOutput = "[]";

        assertEquals(expectedOutput, classUnderTest.leftJoinMap(firstHash, secondHash).toString());

    }

}