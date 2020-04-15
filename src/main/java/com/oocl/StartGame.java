package com.oocl;

public class StartGame {

    public void startingTheGame() {
        int attemptTime = 0;
        String comparedResult = "";
        String allCorrect = "4A0B";
        int noChanceLeft = 5; //-->constant

        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        InputHandler inputHandler = new InputHandler();
        CompareInputWithRandomNumber compareInputWithRandomNumber = new CompareInputWithRandomNumber();
        String generatedNumber = generateRandomNumber.generate4RandomNumber();
        do {
            String userInput = inputHandler.getUserInput();
            comparedResult = compareInputWithRandomNumber.compareInputWithRandom(userInput, generatedNumber);
            System.out.println(comparedResult);
            if (comparedResult.equals(allCorrect)) {
                System.out.println("you win"); //magic string
                break;
            }
            if (attemptTime == noChanceLeft) {
                System.out.println("you lose. The answer is : " + generatedNumber); //format String, can put after while
            }
            attemptTime++;

        } while (attemptTime <= noChanceLeft);
    }
}

