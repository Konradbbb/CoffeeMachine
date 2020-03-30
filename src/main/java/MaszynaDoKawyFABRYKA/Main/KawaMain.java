package MaszynaDoKawyFABRYKA.Main;

import MaszynaDoKawyFABRYKA.Akcje.*;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.InputScannerImpl;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.PrinterImpl;

public class KawaMain {


    public static void main(String[] args) {

        KawaMain kawa = new KawaMain();
        PrinterImpl menu = new PrinterImpl();
        menu.mainMenuOptions();
        kawa.chooseAction(new InputScannerImpl().getInputString()).getAction();
    }


    public Actions chooseAction(String action){
        Actions actions = null;

        if (action.equals("buy")){
            actions = new Buy();
        } else if (action.equals("remaining")){
            actions = new Remaining();
        } else if (action.equals("exit")){
            actions = new Exit();
        } else if (action.equals("fill")){
            actions = new Fill();
        } else if (action.equals("take")){
            actions = new TakeMoney();
        } else {
            System.out.println("Wrong action! \n");
            Back back = new Back();
            back.getAction();
        }
        return actions;
    }
}
