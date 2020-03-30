package MaszynaDoKawyFABRYKA.Akcje;

import java.util.Scanner;

public class Buy extends Actions {

    CoffeType coffeType;
    Remaining.Resources resources;
    Double giveMoney;


    public enum CoffeType {
        LATTE(100, 200,10,1,7),
        CAPPUCINO(70, 260,13,1,6),
        ESPRESSO(200,0,20,1,5);

        int water;
        int milk;
        int coffeBeans;
        int cups;
        int cost;

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
        public Double giveMeMoney(){
        System.out.println("Give me money: ");
        return giveMoney = getInputDouble();
    }

    public void changeMoney(String string){
        if (string.equals("1")){
            while (giveMoney >= CoffeType.LATTE.getCost()){
                giveMoney -= CoffeType.LATTE.getCost();
                System.out.println("Making your latte :)");
                break;
            }

        } else if (string.equals("2")){
            while (giveMoney >= CoffeType.CAPPUCINO.getCost()){
                giveMoney -= CoffeType.CAPPUCINO.getCost();
                System.out.println("Making your cappucino :)");
                break;
            }

        } else if (string.equals("3")) {
            while (giveMoney >= CoffeType.ESPRESSO.getCost()){
                giveMoney -= CoffeType.ESPRESSO.getCost();
                System.out.println("Making your espresso :)");
                break;
            }

        } else {
            System.out.println("Not enough money");
        }
        System.out.println("Your change: " + giveMoney + "\n");
    }

        @Override
        public void getAction() {

            giveMeMoney();
            System.out.println("Choose coffee type : \n 1. Latte \n 2. Cappucino \n 3. Espresso \n 4. Back");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();

            switch (choose){
                case "1":
                if (resources.WATER.getRecourcesLeft() >= coffeType.LATTE.getWater()){
                    resources.WATER.recourcesLeft -= coffeType.LATTE.getWater();
                } else {
                    notEnoughWater();
                    break;
                }
                if (resources.MILK.getRecourcesLeft() >= coffeType.LATTE.getMilk()){
                    resources.MILK.recourcesLeft -= coffeType.LATTE.getMilk();
                } else {
                    notEnoughMilk();
                    break;
                }
                if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.LATTE.getCoffeBeans()){
                    resources.COFFEBEANS.recourcesLeft -= coffeType.LATTE.getCoffeBeans();
                } else {
                    notEnoughBeans();
                }
                if (resources.CUPS.getRecourcesLeft() >= coffeType.LATTE.getCups()){
                    resources.CUPS.recourcesLeft -= coffeType.LATTE.getCups();
                } else {
                    notEnoughCups();
                    break;
                }
                    resources.MONEY.recourcesLeft += coffeType.LATTE.getCost();
                    changeMoney(choose);
                    break;

                case "2":
                    if (resources.WATER.getRecourcesLeft() >= coffeType.CAPPUCINO.getWater()){
                        resources.WATER.recourcesLeft -= coffeType.CAPPUCINO.getWater();
                    } else {
                        notEnoughWater();
                        break;
                    }
                    if (resources.MILK.getRecourcesLeft() >= coffeType.CAPPUCINO.getMilk()){
                        resources.MILK.recourcesLeft -= coffeType.CAPPUCINO.getMilk();
                    } else {
                        notEnoughMilk();
                        break;
                    }
                    if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.CAPPUCINO.getCoffeBeans()){
                        resources.COFFEBEANS.recourcesLeft -= coffeType.CAPPUCINO.getCoffeBeans();
                    } else {
                        notEnoughBeans();
                        break;
                    }
                    if (resources.CUPS.getRecourcesLeft() >= coffeType.CAPPUCINO.getCups()){
                        resources.CUPS.recourcesLeft -= coffeType.CAPPUCINO.getCups();
                    } else {
                        notEnoughCups();
                        break;
                    }
                    resources.MONEY.recourcesLeft += coffeType.CAPPUCINO.getCost();
                    changeMoney(choose);
                    break;

                case "3":
                    if (resources.WATER.getRecourcesLeft() >= coffeType.ESPRESSO.getWater()){
                        resources.WATER.recourcesLeft -= coffeType.ESPRESSO.getWater();
                    } else {
                        notEnoughWater();
                        break;
                    }
                    if (resources.MILK.getRecourcesLeft() >= coffeType.ESPRESSO.getMilk()){
                        resources.MILK.recourcesLeft -= coffeType.ESPRESSO.getMilk();
                    } else {
                        notEnoughMilk();
                        break;
                    }
                    if (resources.COFFEBEANS.getRecourcesLeft() >= coffeType.ESPRESSO.getCoffeBeans()){
                        resources.COFFEBEANS.recourcesLeft -= coffeType.ESPRESSO.getCoffeBeans();
                    } else {
                        notEnoughBeans();
                        break;
                    }
                    if (resources.CUPS.getRecourcesLeft() >= coffeType.ESPRESSO.getCups()){
                        resources.CUPS.recourcesLeft -= coffeType.ESPRESSO.getCups();
                    } else {
                        notEnoughCups();
                        break;
                    }
                    resources.MONEY.recourcesLeft += coffeType.ESPRESSO.getCost();
                    changeMoney(choose);
                    break;

                    case "4":
                    break;
            }

            Back back = new Back();
            back.getAction();

        }

}
