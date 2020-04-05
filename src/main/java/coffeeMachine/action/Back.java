package coffeeMachine.action;

import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Back extends Actions {

    @Override
    public void getAction(){
        PrinterImpl menu = new PrinterImpl();
        menu.mainMenuOptions();
        Actions actions = new Actions().chooseAction(new InputScannerImpl().getInputString());
        actions.getAction();
    }
}
