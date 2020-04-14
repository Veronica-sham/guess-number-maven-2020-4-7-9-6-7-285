package com.oocl;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputNumberHandler {

    public String getInputNumber() {
        List<String> inputNo;
        String inputNumbers = "";
        String InputRight = "You entered string ";
        String InputWrong = "Wrong Input, Input again";
        do {
            System.out.println(" Input 4 numbers in the format of xxxx(e.g.1234): ");
            Scanner consoleInput = new Scanner(System.in);
            String userInputNumber = consoleInput.nextLine();
            inputNo = Arrays.asList(userInputNumber.split(""));
            if (inputNo.size() == inputNo.stream().distinct().count() && inputNo.size() == 4) {
                InputRight = InputRight + userInputNumber;
                System.out.println(InputRight);
                inputNumbers = userInputNumber;
            } else {
                System.out.println(InputWrong);
            }
        } while (inputNo.size() != inputNo.stream().distinct().count() || inputNo.size() != 4);
        return inputNumbers;
    }
}
