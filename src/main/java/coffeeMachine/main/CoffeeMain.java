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


    public MachineAction chooseAction(String action) {
        MachineAction machineAction = null;

        if (action.equals("buy")) {
            machineAction = new Buy(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("remaining")) {
            machineAction = new Remaining(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("exit")) {
            machineAction = new Exit(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("fill")) {
            machineAction = new Fill(new InputScannerImpl(), new PrinterImpl());
        } else if (action.equals("take")) {
            machineAction = new TakeMoney(new InputScannerImpl(), new PrinterImpl());
        } else {
            System.out.println("Wrong action! \n");
            Back back = new Back(new InputScannerImpl(), new PrinterImpl());
            back.getAction();
        }
        return machineAction;
    }
}
