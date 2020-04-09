package com.oocl;

import java.util.*;
import java.util.stream.Collectors;

public class GuessNumber {


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

    public String getInputNumber() {
        List<String> inputNo;
        String inputNumbers = "";
        String InputRight = "You entered string ";
        String InputWrong = "Wrong Input, Input again";
        do {
            System.out.println(" Input 4 numbers in the format of xxxx(e.g.1234): ");
            Scanner consoleInput = new Scanner(System.in);
            String userinputNumber = consoleInput.nextLine();
            inputNo = Arrays.asList(userinputNumber.split(""));
            if (inputNo.size() == inputNo.stream().distinct().count() && inputNo.size() == 4) {
                InputRight = InputRight + userinputNumber;
                System.out.println(InputRight);
                inputNumbers = userinputNumber;
            } else {
                System.out.println(InputWrong);
            }
        } while (inputNo.size() != inputNo.stream().distinct().count() || inputNo.size() != 4);
        return inputNumbers;
    }

    public String compareInputWithRandom(String input, String generatedNo) {
        List<String> randomNoList;
        List<String> inputNoList;
        int countA = 0;
        int countB = 0;
        List<String> getItCorrect = new ArrayList<>();
        inputNoList = Arrays.asList(input.split(""));
        randomNoList = Arrays.asList(generatedNo.split(""));
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
