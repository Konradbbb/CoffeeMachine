package coffeeMachine.action;

import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;

public class Remaining extends MachineAction {

    public Remaining(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    public enum Resources {
        WATER(1300),
        MILK(1500),
        COFFEBEANS(230),
        CUPS(10),
        MONEY(550);

        protected int recourcesLeft;

        Resources(int recourcesLeft) {
            this.recourcesLeft = recourcesLeft;
        }

        public int getRecourcesLeft() {
            return recourcesLeft;
        }

        public void setRecourcesLeft(int recourcesLeft) {
            this.recourcesLeft = recourcesLeft;
        }
    }

    @Override
    public void getAction() {
        System.out.println("Resources left : \n"
                + Resources.WATER.getRecourcesLeft() + "ml of water \n"
                + Resources.MILK.getRecourcesLeft() + "ml of milk \n"
                + Resources.COFFEBEANS.getRecourcesLeft() + "gr coffee beans \n"
                + Resources.CUPS.getRecourcesLeft() + " cups \n"
                + Resources.MONEY.getRecourcesLeft() + "$ \n");

        Back back = new Back(inputScanner, printer);
        back.getAction();
    }

}
