package coffeeMachine.action;

import coffeeMachine.InputOutput.InputScannerImpl;
import coffeeMachine.InputOutput.PrinterImpl;

public class Buy extends MachineAction {

    CoffeType coffeType;
    Remaining.Resources resources;
    private double giveMoney;

    public Buy(InputScannerImpl inputScanner, PrinterImpl printer) {
        super(inputScanner, printer);
    }

    public enum CoffeType {
        LATTE(100, 200, 10, 1, 7),
        CAPPUCINO(70, 260, 13, 1, 6),
        ESPRESSO(200, 0, 20, 1, 5);

        private int water;
        private int milk;
        private int coffeBeans;
        private int cups;
        private int cost;

        CoffeType(int water, int milk, int coffeBeans, int cups, int cost) {
            this.water = water;
            this.milk = milk;
            this.coffeBeans = coffeBeans;
            this.cups = cups;
            this.cost = cost;
        }

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffeBeans() {
            return coffeBeans;
        }

        public int getCups() {
            return cups;
        }

        public int getCost() {
            return cost;
        }
    }

    public Double giveMeMoney() {
        System.out.println("Give me money: ");
        return giveMoney = new InputScannerImpl().getInputDouble();
    }

    public void changeMoney(String string) {
        if (string.equals("1")) {
            while (giveMoney >= CoffeType.LATTE.getCost()) {
                giveMoney -= CoffeType.LATTE.getCost();
                System.out.println("Making your latte :)");
                break;
            }

        } else if (string.equals("2")) {
            while (giveMoney >= CoffeType.CAPPUCINO.getCost()) {
                giveMoney -= CoffeType.CAPPUCINO.getCost();
                System.out.println("Making your cappucino :)");
                break;
            }

        } else if (string.equals("3")) {
            while (giveMoney >= CoffeType.ESPRESSO.getCost()) {
                giveMoney -= CoffeType.ESPRESSO.getCost();
                System.out.println("Making your espresso :)");
                break;
            }

        } else {
            printer.notEnoughMoney();
        }
        System.out.println("Your change: " + giveMoney + "\n");
    }

    @Override
    public void getAction() {

        giveMeMoney();
        new PrinterImpl().buyPrint();
        String choose = new InputScannerImpl().getInputString();

        switch (choose) {
            case "1":
                if (resources.WATER.getRecourcesLeft() >= coffeType.LATTE.getWater()) {
                    resources.WATER.recourcesLeft -= coffeType.LATTE.getWater();
                } else {
                    new PrinterImpl().notEnoughWater();
                    break;
                }
                if (resources.MILK.getRecourcesLeft() >= coffeType.LATTE.getMilk()) {
                    resources.MILK.recourcesLeft -= coffeType.LATTE.getMilk();
                } else {
                    printer.notEnoughMilk();
                    break;
                }
                if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.LATTE.getCoffeBeans()) {
                    resources.COFFEBEANS.recourcesLeft -= coffeType.LATTE.getCoffeBeans();
                } else {
                    new PrinterImpl().notEnoughBeans();
                }
                if (resources.CUPS.getRecourcesLeft() >= coffeType.LATTE.getCups()) {
                    resources.CUPS.recourcesLeft -= coffeType.LATTE.getCups();
                } else {
                    new PrinterImpl().notEnoughCups();
                    break;
                }
                resources.MONEY.recourcesLeft += coffeType.LATTE.getCost();
                changeMoney(choose);
                break;

            case "2":
                if (resources.WATER.getRecourcesLeft() >= coffeType.CAPPUCINO.getWater()) {
                    resources.WATER.recourcesLeft -= coffeType.CAPPUCINO.getWater();
                } else {
                    new PrinterImpl().notEnoughWater();
                    break;
                }
                if (resources.MILK.getRecourcesLeft() >= coffeType.CAPPUCINO.getMilk()) {
                    resources.MILK.recourcesLeft -= coffeType.CAPPUCINO.getMilk();
                } else {
                    new PrinterImpl().notEnoughMilk();
                    break;
                }
                if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.CAPPUCINO.getCoffeBeans()) {
                    resources.COFFEBEANS.recourcesLeft -= coffeType.CAPPUCINO.getCoffeBeans();
                } else {
                    new PrinterImpl().notEnoughBeans();
                    break;
                }
                if (resources.CUPS.getRecourcesLeft() >= coffeType.CAPPUCINO.getCups()) {
                    resources.CUPS.recourcesLeft -= coffeType.CAPPUCINO.getCups();
                } else {
                    new PrinterImpl().notEnoughCups();
                    break;
                }
                resources.MONEY.recourcesLeft += coffeType.CAPPUCINO.getCost();
                changeMoney(choose);
                break;

            case "3":
                if (resources.WATER.getRecourcesLeft() >= coffeType.ESPRESSO.getWater()) {
                    resources.WATER.recourcesLeft -= coffeType.ESPRESSO.getWater();
                } else {
                    new PrinterImpl().notEnoughWater();
                    break;
                }
                if (resources.MILK.getRecourcesLeft() >= coffeType.ESPRESSO.getMilk()) {
                    resources.MILK.recourcesLeft -= coffeType.ESPRESSO.getMilk();
                } else {
                    new PrinterImpl().notEnoughMilk();
                    break;
                }
                if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.ESPRESSO.getCoffeBeans()) {
                    resources.COFFEBEANS.recourcesLeft -= coffeType.ESPRESSO.getCoffeBeans();
                } else {
                    new PrinterImpl().notEnoughBeans();
                    break;
                }
                if (resources.CUPS.getRecourcesLeft() >= coffeType.ESPRESSO.getCups()) {
                    resources.CUPS.recourcesLeft -= coffeType.ESPRESSO.getCups();
                } else {
                    new PrinterImpl().notEnoughCups();
                    break;
                }
                resources.MONEY.recourcesLeft += coffeType.ESPRESSO.getCost();
                changeMoney(choose);
                break;

            case "4":
                break;
        }

        Back back = new Back(inputScanner,printer);
        back.getAction();

    }

}
