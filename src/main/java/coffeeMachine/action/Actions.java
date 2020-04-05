package coffeeMachine.action;

import coffeeMachine.main.CoffeeMain;
import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Actions extends CoffeeMain {

    public void getAction(){};

    InputScannerImpl inputScanner;
    PrinterImpl printer;

    public Actions(InputScannerImpl inputScanner, PrinterImpl printer) {
        this.inputScanner = inputScanner;
        this.printer = printer;
    }

}


