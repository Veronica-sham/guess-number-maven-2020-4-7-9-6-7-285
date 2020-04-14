package com.oocl;

public class StartGame {

    public void startingTheGame() {
        int attemptTime = 0;
        String comparedResult = "";
        String allCorrect = "4A0B";
        int noChanceLeft = 5;

        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        InputHandler inputHandler = new InputHandler();
        CompareInputWithRandomNumber compareInputWithRandomNumber = new CompareInputWithRandomNumber();
        String generatedNumber = generateRandomNumber.generate4RandomNumber();
        System.out.println("generated number: " + generatedNumber);
        do {
            String userInput = inputHandler.getUserInput();
            comparedResult = compareInputWithRandomNumber.compareInputWithRandom(userInput, generatedNumber);
            System.out.println(comparedResult);
            if (comparedResult.equals(allCorrect)) {
                System.out.println("you win");
                break;
            }
            if (!comparedResult.equals(allCorrect) && attemptTime == noChanceLeft) {
                System.out.println("you lose. The answer is : " + generatedNumber);
            }
            attemptTime++;

        } while (attemptTime <= 5);
    }
}

