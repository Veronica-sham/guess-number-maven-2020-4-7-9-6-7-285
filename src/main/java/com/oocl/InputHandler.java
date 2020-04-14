package com.oocl;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private String inputNumbers;
    public static final String SPLIT_WORDS = "";

    public void validateInput() {
        List<String> inputNo;
        String inputNumbers = "";
        String inputRightMessage = "You entered string ";
        String inputWrongMessage = "Wrong Input, Input again";
        String initialMessage = " Input 4 numbers in the format of xxxx(e.g.1234): ";
        int inputLength;
        long distinctWordsCountInInput;
        int validInputLength = 4;

        do {
            System.out.println(initialMessage);
            Scanner consoleInput = new Scanner(System.in);
            String userInputNumber = consoleInput.nextLine();
            inputNo = Arrays.asList(userInputNumber.split(SPLIT_WORDS));
            inputLength = inputNo.size();
            distinctWordsCountInInput = inputNo.stream().distinct().count();
            if (inputLength == distinctWordsCountInInput && inputLength == validInputLength) {
                inputRightMessage = inputRightMessage + userInputNumber;
                System.out.println(inputRightMessage);
                inputNumbers = userInputNumber;
            } else {
                System.out.println(inputWrongMessage);
            }
        } while (inputLength != distinctWordsCountInInput || inputLength != validInputLength);
        this.inputNumbers = inputNumbers;
    }

    public String getUserInput() {
        validateInput();
        return this.inputNumbers;
    }
}
