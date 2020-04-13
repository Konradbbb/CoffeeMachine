package coffeeMachine.InputOutput;

import java.util.Scanner;

public class InputScannerImpl implements InputScanner {

    Scanner scanner = new Scanner(System.in);

    @Override
    public String getInputString() {
        String input = scanner.nextLine();
        return input;
    }

    @Override
    public Integer getInputInt() {
        int input = scanner.nextInt();
        return input;
    }

    @Override
    public Double getInputDouble() {
        double input = scanner.nextDouble();
        return input;
    }
}
