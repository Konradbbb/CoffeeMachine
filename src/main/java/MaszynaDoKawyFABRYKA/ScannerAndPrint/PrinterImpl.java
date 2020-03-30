package MaszynaDoKawyFABRYKA.ScannerAndPrint;

public class PrinterImpl implements Printer {

    @Override
    public void mainMenuOptions(){
        System.out.println("Hello, choose your action: \n 1. Buy \n 2. Remaining \n 3. Fill \n 4. Take money \n 5. Exit");
    }

    @Override
    public void buyPrint(){
        System.out.println("Choose coffee type : \n 1. Latte \n 2. Cappucino");
    }

    @Override
    public void notEnoughWater() {
        System.out.println("Not enough water");
    }

}
