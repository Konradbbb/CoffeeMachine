package coffeeMachine.action;

import coffeeMachine.main.CoffeeMain;
import coffeeMachine.scannerAndPrint.InputScanner;
import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.Printer;

import java.util.Scanner;

public class Actions extends CoffeeMain {

    Scanner scanner = new Scanner(System.in);

    public void getAction(){};


    public String getInputString() {
        String input = scanner.nextLine();
        return input;
    }

    public Integer getInputInt() {
        int input = scanner.nextInt();
        return input;
    }

    public Double getInputDouble() {
        double input = scanner.nextDouble();
        return input;
    }

    public void mainMenuOptions() {
    }

    public void buyPrint() {
    }

    public void notEnoughWater() {
        System.out.println("Not enough water");
    }

    public void notEnoughMilk() {
        System.out.println("Not enough milk");
    }

    public void notEnoughBeans() {
        System.out.println("Not enough coffee beans");
    }

    public void notEnoughCups() {
        System.out.println("Not enough cups");
    }


}


