package coffeeMachine.main;

import coffeeMachine.action.*;
import coffeeMachine.scannerAndPrint.InputScannerImpl;
import coffeeMachine.scannerAndPrint.PrinterImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class KawaMainTest {


    Buy buy = Mockito.mock(Buy.class);
    Fill fill = Mockito.mock(Fill.class);
    Remaining remaining = Mockito.mock(Remaining.class);
    TakeMoney takeMoney = Mockito.mock(TakeMoney.class);
    Back back = Mockito.mock(Back.class);
    Exit exit = Mockito.mock(Exit.class);
    MachineAction machineAction = Mockito.mock(MachineAction.class);
    InputScannerImpl inputScanner = Mockito.mock(InputScannerImpl.class);
    PrinterImpl printer = Mockito.mock(PrinterImpl.class);

    CoffeeMain tested = new CoffeeMain();
    MachineAction testedMachineAction = new MachineAction(new InputScannerImpl(), new PrinterImpl());

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
        testedMachineAction.getAction();
        Mockito.verify(buy);
    }

}