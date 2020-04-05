package coffeeMachine.action;

import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Exit extends Actions {

    public Exit(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    @Override
    public void getAction(){
        new PrinterImpl().goodBye();
    }
}
