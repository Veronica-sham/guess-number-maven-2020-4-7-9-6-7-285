<<<<<<< HEAD
package com.oocl;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
=======
package com.oocl;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
>>>>>>> 7387c087334dcf6f55f54d94482e8f9ebc6bed70
}