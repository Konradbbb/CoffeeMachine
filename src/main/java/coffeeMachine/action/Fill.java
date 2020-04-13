package coffeeMachine.action;

import coffeeMachine.InputOutput.InputScannerImpl;
import coffeeMachine.InputOutput.PrinterImpl;

public class Fill extends MachineAction {

    public Fill(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    @Override
    public void getAction() {

        System.out.println("Add water: ");
        Remaining.Resources.WATER.setRecourcesLeft(new InputScannerImpl().getInputInt() + Remaining.Resources.WATER.getRecourcesLeft());

        System.out.println("Add milk: ");
        Remaining.Resources.MILK.setRecourcesLeft(new InputScannerImpl().getInputInt() + Remaining.Resources.MILK.getRecourcesLeft());
//
        System.out.println("Add coffee bean: ");
        Remaining.Resources.COFFEBEANS.setRecourcesLeft(new InputScannerImpl().getInputInt() + Remaining.Resources.COFFEBEANS.getRecourcesLeft());

        System.out.println("Add cups: ");
        Remaining.Resources.CUPS.setRecourcesLeft(new InputScannerImpl().getInputInt() + Remaining.Resources.CUPS.getRecourcesLeft());

        Back back = new Back(inputScanner, printer);
        back.getAction();
    }

}
