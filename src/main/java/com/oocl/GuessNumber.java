package com.oocl;

import java.util.*;
import java.util.stream.Collectors;

public class GuessNumber {



    public String startTheGameWithInput(int number){
        return "hi";

    }

    public String generate4RandomNumber() {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> generated ;
        String combine = "";
        Collections.shuffle(numberList);
        generated= numberList.subList(0,4);

        for (Integer s : generated) {
            combine += s.toString();
        }
        return combine;
    }
}
