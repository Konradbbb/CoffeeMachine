package coffeeMachine.action;

import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Back extends MachineAction {

    public Back(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    @Override
    public void getAction(){
        printer.mainMenuOptions();
        MachineAction machineAction = new MachineAction(inputScanner, printer).chooseAction(inputScanner.getInputString());
        machineAction.getAction();
    }
}
