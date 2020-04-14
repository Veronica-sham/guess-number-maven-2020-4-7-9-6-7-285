package com.oocl;

import java.util.*;

public class GenerateRandomNumber {


    public static final String SPLIT_WORDS = "";

    public String generate4RandomNumber() {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> generatedNumber;
        String combine = "";
        Collections.shuffle(numberList);
        generatedNumber = numberList.subList(0, 4);

        for (Integer number : generatedNumber) {
            combine += number.toString();
        }
        return combine;
    }



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
