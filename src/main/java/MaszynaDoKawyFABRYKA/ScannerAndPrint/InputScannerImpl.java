package MaszynaDoKawyFABRYKA.ScannerAndPrint;

import java.util.Scanner;

public class InputScannerImpl implements InputScanner{

    Scanner scanner = new Scanner(System.in);

    public String  getInputString() {
        String  input = scanner.nextLine();
        return input;
    }


    public Integer getInputInt() {
        int input = scanner.nextInt();
        return input;
    }
}
