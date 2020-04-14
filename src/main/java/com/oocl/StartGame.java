package com.oocl;

public class StartGame {

    public void startingTheGame() {
        int attemptTime = 0;
        String compareResult = "";

        GuessNumber guessNumber = new GuessNumber();
        String generatedNumber = guessNumber.generate4RandomNumber();
        //System.out.println("generated number: " + generatedNumber);
        do {
            String userInput = guessNumber.getInputNumber();
            compareResult = guessNumber.compareInputWithRandom(userInput, generatedNumber);
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

