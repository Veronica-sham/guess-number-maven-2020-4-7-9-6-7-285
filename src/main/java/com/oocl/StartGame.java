package com.oocl;

public class StartGame {

    public void startingTheGame() {
        int attemptTime = 0;
        String compareResult = "";

        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        InputNumberHandler inputNumberHandler = new InputNumberHandler();
        String generatedNumber = generateRandomNumber.generate4RandomNumber();
        //System.out.println("generated number: " + generatedNumber);
        do {
            String userInput = inputNumberHandler.getInputNumber();
            compareResult = generateRandomNumber.compareInputWithRandom(userInput, generatedNumber);
            System.out.println(compareResult);
            if (compareResult.equals("4A0B")) {
                System.out.println("you win");
                break;
            }
            if (!compareResult.equals("4A0B") && attemptTime == 5) {
                System.out.println("you lose. The answer is : " + generatedNumber);
            }
            attemptTime++;

        } while (attemptTime <= 5);
    }
}

