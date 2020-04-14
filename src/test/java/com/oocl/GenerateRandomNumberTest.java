package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class GenerateRandomNumberTest {


    public static void main(String[] args) {
        StartGame startGame = new StartGame();
        startGame.startingTheGame();
    }

    @Test
    public void should_return_xAxB() {
        Boolean isXAXB = false;
        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        CompareInputWithRandomNumber compareInputWithRandomNumber = new CompareInputWithRandomNumber();
        InputHandler inputHandler = new InputHandler();
        String generatedNumber = generateRandomNumber.generate4RandomNumber();
        System.out.println("generated number: " + generatedNumber);
        String SimulatedInput = "1379";
        InputStream in = new ByteArrayInputStream(SimulatedInput.getBytes());
        System.setIn(in);
        String userInput = inputHandler.getUserInput();
        String compareResult = compareInputWithRandomNumber.compareInputWithRandom(userInput, generatedNumber);
        if (compareResult.regionMatches(1, "A", 0, 0) && compareResult.regionMatches(3, "B", 0, 0)) {
            isXAXB = true;
        }
        Assert.assertEquals(true, isXAXB);
    }

    @Test
    public void should_return_Non_Repeated_Random_Number() {
        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        List<String> checkNumberList;
        String generatedNumber = generateRandomNumber.generate4RandomNumber();
        Boolean nonRepeat = false;
        checkNumberList = Arrays.asList(generatedNumber.split(""));
        if (checkNumberList.size() == checkNumberList.stream().distinct().count()) {
            nonRepeat = true;
        }
        Assert.assertEquals(true, nonRepeat);
    }

    @Test
    public void should_Confirm_Input_From_User_Is_Right() {
        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        InputHandler inputHandler = new InputHandler();
        String SimulatedInput = "1379";
        InputStream in = new ByteArrayInputStream(SimulatedInput.getBytes());
        System.setIn(in);
        Assert.assertEquals("1379", inputHandler.getUserInput());
    }

}
