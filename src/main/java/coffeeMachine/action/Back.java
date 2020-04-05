package coffeeMachine.action;

import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Back extends Actions {

    public Back(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    @Override
    public void getAction(){
        PrinterImpl menu = new PrinterImpl();
        menu.mainMenuOptions();
        Actions actions = new Actions(inputScanner, printer).chooseAction(new InputScannerImpl().getInputString());
        actions.getAction();
    }
}
