package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareInputWithRandomNumber {

    public static final String SPLIT_WORDS = "";

    public String compareInputWithRandom(String input, String generatedNo) {
        List<String> randomNoList;
        List<String> inputNoList;
        int countA = 0;
        int countB = 0;
        List<String> getItCorrect = new ArrayList<>();
        inputNoList = Arrays.asList(input.split(SPLIT_WORDS));
        randomNoList = Arrays.asList(generatedNo.split(SPLIT_WORDS));
        List<String> inputNo = new ArrayList<String>(inputNoList);
        List<String> randomNo = new ArrayList<String>(randomNoList);
        for (int loopAllNo = 0; loopAllNo < randomNo.size(); loopAllNo++) {
            if (randomNo.get(loopAllNo).equals(inputNo.get(loopAllNo))) {
                countA++;
                getItCorrect.add(randomNo.get(loopAllNo));
            }
        }
        inputNo.removeAll(getItCorrect);
        randomNo.retainAll(inputNo);
        countB = randomNo.size();

        return countA + "A" + countB + "B";

    }
}
