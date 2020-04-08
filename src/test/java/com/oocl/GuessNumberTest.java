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
        System.out.println(generatedNumber);
        System.out.println(guessNumber.getInputNumber());


    }

  /*  @Test
    public void return_xAxB(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result = guessNumber.startTheGameWithInput(1);
        //then
        Assert.assertEquals("hi", result);

    } */

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
        Assert.assertEquals(true,guessNumber.getInputNumber());
    }

}
