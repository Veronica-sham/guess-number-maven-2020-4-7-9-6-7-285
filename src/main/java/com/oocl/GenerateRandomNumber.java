package com.oocl;

import java.util.*;

public class GenerateRandomNumber {


    public String generate4RandomNumber() {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> generatedNumber;
        StringBuilder stringOfGeneratedNumber = new StringBuilder();
        Collections.shuffle(numberList);
        generatedNumber = numberList.subList(0, 4);

        for (Integer number : generatedNumber) {
            stringOfGeneratedNumber.append(number.toString());
        }
        return stringOfGeneratedNumber.toString();
    }


}
