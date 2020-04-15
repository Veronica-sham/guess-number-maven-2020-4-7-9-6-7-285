package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareInputWithRandomNumber {

    public static final String SPLIT_WORDS = "";
// No -->Number rename
    public String compareInputWithRandom(String input, String generatedNumber) {
        List<String> randomNumberList;
        List<String> inputNumberList;
        int countA = 0;
        int countB = 0;
        List<String> getItCorrect = new ArrayList<>(); //rename to getCorrectNumber
        inputNumberList = Arrays.asList(input.split(SPLIT_WORDS));
        randomNumberList = Arrays.asList(generatedNumber.split(SPLIT_WORDS));
        List<String> inputNumber = new ArrayList<String>(inputNumberList);
        List<String> randomNumber = new ArrayList<String>(randomNumberList);
        for (int loopAllNumber = 0; loopAllNumber < randomNumber.size(); loopAllNumber++) {
            if (randomNumber.get(loopAllNumber).equals(inputNumber.get(loopAllNumber))) {
                countA++;
                getItCorrect.add(randomNumber.get(loopAllNumber));
            }
        }
        inputNumber.removeAll(getItCorrect);
        randomNumber.retainAll(inputNumber);
        countB = randomNumber.size();

        return countA + "A" + countB + "B"; //constant name, string format

    }
}
