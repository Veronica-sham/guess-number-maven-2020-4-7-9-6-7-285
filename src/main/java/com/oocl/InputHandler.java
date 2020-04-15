package com.oocl;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private static final String SPLIT_WORDS = "";
    private static final String INPUT_WRONG_MESSAGE = "Wrong Input, Input again";
    private static final String INITIAL_MESSAGE = " Input 4 numbers in the format of xxxx(e.g.1234): ";
    public static final int VALID_INPUT_LENGTH = 4;
    private String inputNumbers;

    public void validateInput() {
        List<String> inputNo;
        String inputNumbers = "";
        String inputRightMessage = "You entered string ";
        int inputLength;
        long distinctWordsCountInInput;
        Scanner consoleInput = new Scanner(System.in);

        do {
            System.out.println(INITIAL_MESSAGE);

            String userInputNumber = consoleInput.nextLine();
            inputNo = Arrays.asList(userInputNumber.split(SPLIT_WORDS));
            inputLength = inputNo.size();
            distinctWordsCountInInput = inputNo.stream().distinct().count();
            if (inputLength == distinctWordsCountInInput && inputLength == VALID_INPUT_LENGTH) {
                inputRightMessage = inputRightMessage + userInputNumber;
                System.out.println(inputRightMessage);
                inputNumbers = userInputNumber;
            } else {
                System.out.println(INPUT_WRONG_MESSAGE);
            }
        } while (inputLength != distinctWordsCountInInput || inputLength != VALID_INPUT_LENGTH);
        this.inputNumbers = inputNumbers;
    }

    public String getUserInput() {
        validateInput();
        return this.inputNumbers;
    }
}
