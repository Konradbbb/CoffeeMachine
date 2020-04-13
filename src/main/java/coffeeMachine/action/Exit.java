package coffeeMachine.action;

import coffeeMachine.InputOutput.InputScannerImpl;
import coffeeMachine.InputOutput.PrinterImpl;

public class Exit extends MachineAction {

    public Exit(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    @Override
    public void getAction(){
        new PrinterImpl().goodBye();
    }
}
