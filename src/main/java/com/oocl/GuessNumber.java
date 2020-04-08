package com.oocl;

import java.util.*;
import java.util.stream.Collectors;

public class GuessNumber {



    public String startTheGameWithInput(int number){
        return "hi";

    }

    public String generate4RandomNumber() {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> generatedNumber ;
        String combine = "";
        Collections.shuffle(numberList);
        generatedNumber= numberList.subList(0,4);

        for (Integer number : generatedNumber) {
            combine += number.toString();
        }
        return combine;
    }

    public Boolean getInputNumber(){
        List<String> inputNo;
        Boolean isInputRight = false;
        String InputRight = "You entered string ";
        String InputWrong = "Wrong Input, Input again";
        do {
            System.out.println("Input 4 numbers in the format of xxxx(e.g.1234): ");
            Scanner consoleInput = new Scanner(System.in);
            String inputNumber = consoleInput.nextLine();
            inputNo = Arrays.asList(inputNumber.split(""));
            if (inputNo.size() == inputNo.stream().distinct().count() && inputNo.size() == 4) {
                InputRight = InputRight + inputNumber;
                System.out.println(InputRight);
                isInputRight = true;
            } else {
                System.out.println(InputWrong);
            }
        } while(inputNo.size() != inputNo.stream().distinct().count() || inputNo.size() != 4);
        return isInputRight;
    }

    public void compareInputValid(String input){
        List<String> inputNo;
        inputNo = Arrays.asList(input.split(""));

    }
}
