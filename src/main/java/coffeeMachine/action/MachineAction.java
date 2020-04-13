package coffeeMachine.action;

import coffeeMachine.main.CoffeeMain;
import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class MachineAction extends CoffeeMain {

    protected final InputScannerImpl inputScanner;
    protected final PrinterImpl printer;

    public void getAction(){};

    public MachineAction(InputScannerImpl inputScanner, PrinterImpl printer) {
        this.inputScanner = inputScanner;
        this.printer = printer;
    }

}


