package coffeeMachine.main;

import coffeeMachine.action.*;
import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class CoffeeMain {


    public static void main(String[] args) {

        CoffeeMain kawa = new CoffeeMain();
        new PrinterImpl().mainMenuOptions();
        kawa.chooseAction(new InputScannerImpl().getInputString()).getAction();
    }


    public Actions chooseAction(String action) {
        Actions actions = null;

        if (action.equals("buy")) {
            actions = new Buy(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("remaining")) {
            actions = new Remaining(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("exit")) {
            actions = new Exit(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("fill")) {
            actions = new Fill(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("take")) {
            actions = new TakeMoney(new InputScannerImpl(), new PrinterImpl());
        } else {
            System.out.println("Wrong action! \n");
            Back back = new Back(new InputScannerImpl(), new PrinterImpl());
            back.getAction();
        }
        return actions;
    }
}
