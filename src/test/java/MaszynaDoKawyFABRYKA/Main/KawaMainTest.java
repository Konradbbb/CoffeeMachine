package MaszynaDoKawyFABRYKA.Main;

import MaszynaDoKawyFABRYKA.Akcje.*;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.InputScannerImpl;
import MaszynaDoKawyFABRYKA.ScannerAndPrint.PrinterImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class KawaMainTest {


    Buy buy = Mockito.mock(Buy.class);
    Fill fill = Mockito.mock(Fill.class);
    Remaining remaining = Mockito.mock(Remaining.class);
    TakeMoney takeMoney = Mockito.mock(TakeMoney.class);
    Back back = Mockito.mock(Back.class);
    Exit exit = Mockito.mock(Exit.class);
    Actions actions = Mockito.mock(Actions.class);
    InputScannerImpl inputScanner = Mockito.mock(InputScannerImpl.class);
    PrinterImpl printer = Mockito.mock(PrinterImpl.class);

    KawaMain tested = new KawaMain();
    Actions testedActions = new Actions();

    @Test
    public void chooseAction(){
        Mockito.when(inputScanner.getInputString()).thenReturn("buy");
        tested.chooseAction("buy");
        Mockito.verify(buy);
    }

    @Test
    public void chooseCoffeAction(){
        Mockito.when(inputScanner.getInputString()).thenReturn("buy");
        tested.chooseAction("buy");
        testedActions.getAction();
        Mockito.verify(buy);
    }

}