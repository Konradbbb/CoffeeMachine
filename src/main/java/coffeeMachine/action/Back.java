package coffeeMachine.action;

import coffeeMachine.InputOutput.InputScannerImpl;
import coffeeMachine.InputOutput.PrinterImpl;

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
