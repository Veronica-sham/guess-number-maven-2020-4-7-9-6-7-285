package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class GuessNumberTest {


    public static void main(String[] args){

        GuessNumber guessNumber = new GuessNumber();
        String generatedNumber = guessNumber.generate4RandomNumber();
        System.out.println("generated number: "+generatedNumber);
        String userInput = guessNumber.getInputNumber();
        String compareResult = guessNumber.compareInputWithRandom(userInput,generatedNumber);
        System.out.println(compareResult);


    }

    @Test
    public void should_return_xAxB(){
        GuessNumber guessNumber = new GuessNumber();
        String generatedNumber = guessNumber.generate4RandomNumber();
        System.out.println("generated number: "+generatedNumber);
        String SimulatedInput = "1379";
        InputStream in = new ByteArrayInputStream(SimulatedInput.getBytes());
        System.setIn(in);
        String userInput = guessNumber.getInputNumber();
        String compareResult = guessNumber.compareInputWithRandom(userInput,generatedNumber);
        Assert.assertEquals("xAxB",compareResult);

    }

    @Test
    public void should_return_Non_Repeated_Random_Number(){
        GuessNumber guessNumber = new GuessNumber();
        List<String> checkNumberList;
        String generatedNumber = guessNumber.generate4RandomNumber();
        Boolean nonRepeat = false;
        checkNumberList = Arrays.asList(generatedNumber.split(""));
        if (checkNumberList.size() == checkNumberList.stream().distinct().count()){
            nonRepeat = true;
        }
        Assert.assertEquals(true, nonRepeat);
    }

    @Test
    public void should_Confirm_Input_From_User_Is_Right(){
        GuessNumber guessNumber = new GuessNumber();
        String SimulatedInput = "1379";
        InputStream in = new ByteArrayInputStream(SimulatedInput.getBytes());
        System.setIn(in);
        Assert.assertEquals("1379",guessNumber.getInputNumber());
    }

}
