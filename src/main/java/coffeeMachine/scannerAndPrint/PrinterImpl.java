package coffeeMachine.scannerAndPrint;

public class PrinterImpl implements Printer {

    @Override
    public void mainMenuOptions() {
        System.out.println("Hello, choose your action: \n 1. Buy \n 2. Remaining \n 3. Fill \n 4. Take money \n 5. Exit");
    }

    @Override
    public void buyPrint() {
        System.out.println("Choose coffee type : \n 1. Latte \n 2. Cappucino \n 3. Espresso \n 4. Back \n");
    }

    @Override
    public void notEnoughWater() {
        System.out.println("Not enough water");
    }

    @Override
    public void notEnoughMilk() {
        System.out.println("Not enough milk");
    }

    @Override
    public void notEnoughBeans() {
        System.out.println("Not enough coffee beans");
    }

    @Override
    public void notEnoughCups() {
        System.out.println("Not enough cups");
    }

    @Override
    public void notEnoughMoney() {
        System.out.println("Not enough money");
    }

    @Override
    public void goodBye() {
        System.out.println("Thank you!");
    }


}
