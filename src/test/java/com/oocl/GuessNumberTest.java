package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GuessNumberTest {

    public static void main(String[] args){

        GuessNumber guessNumber = new GuessNumber();
        String generatedNumber = guessNumber.generate4RandomNumber();
        System.out.println(generatedNumber);
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
    public void return_Non_Repeated_Random_Number(){
        GuessNumber guessNumber = new GuessNumber();
        List<String> listss;
        String generatedNumber = guessNumber.generate4RandomNumber();
        Boolean nonRepeat = false;
        listss = Arrays.asList(generatedNumber.split(""));
        if (listss.size() == listss.stream().distinct().count()){
            nonRepeat = true;
        }
        System.out.println(generatedNumber);
    }
}
