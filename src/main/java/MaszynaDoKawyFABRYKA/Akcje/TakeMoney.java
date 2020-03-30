package MaszynaDoKawyFABRYKA.Akcje;

public class TakeMoney extends Actions{

    public void getAction(){

        String password = "KopaMaTaKawa";
        System.out.println("Write password: ");

        for (int i = 0; i < 3; i++) {
            if (getInputString().equals(password)) {
                System.out.println("I gave you " + Remaining.Resources.MONEY.getRecourcesLeft() + "$ \n");
                Remaining.Resources.MONEY.setRecourcesLeft(0);
                break;
            } else {
                System.out.println("Incorrect password!");
            }
            }

        Back back = new Back();
        back.getAction();
        }

    }

