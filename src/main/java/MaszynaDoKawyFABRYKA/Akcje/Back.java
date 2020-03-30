package MaszynaDoKawyFABRYKA.Akcje;

import MaszynaDoKawyFABRYKA.ScannerAndPrint.InputScannerImpl;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.PrinterImpl;

public class Back extends Actions {

    @Override
    public void getAction(){
        PrinterImpl menu = new PrinterImpl();
        menu.mainMenuOptions();
        Actions actions = new Actions().chooseAction(new InputScannerImpl().getInputString());
        actions.getAction();
    }
}
