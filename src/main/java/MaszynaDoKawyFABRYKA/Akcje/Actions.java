package MaszynaDoKawyFABRYKA.Akcje;

import MaszynaDoKawyFABRYKA.Main.KawaMain;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.InputScanner;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.Printer;

import java.util.Scanner;

public class Actions extends KawaMain implements InputScanner, Printer {

    Scanner scanner = new Scanner(System.in);

    public void getAction() {
    }

    public String  getInputString() {
        String  input = scanner.nextLine();
        return input;
    }

    public Integer getInputInt() {
        int input = scanner.nextInt();
        return input;
    }

    public Double getInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }

    public void mainMenuOptions() {
    }

    public void buyPrint() {
    }

    public void notEnoughWater() {
        System.out.println("Not enough water");
    }

    public void notEnoughMilk(){
        System.out.println("Not enough milk");
    }

    public void notEnoughBeans(){
        System.out.println("Not enough coffee beans");
    }

    public void notEnoughCups(){
        System.out.println("Not enough cups");
    }


}


