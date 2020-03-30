package MaszynaDoKawyFABRYKA.Akcje;

public class Fill extends Actions {


    public void getAction(){

        System.out.println("Add water: ");
        Remaining.Resources.WATER.setRecourcesLeft(getInputInt() + Remaining.Resources.WATER.getRecourcesLeft());

        System.out.println("Add milk: ");
        Remaining.Resources.MILK.setRecourcesLeft(getInputInt() + Remaining.Resources.MILK.getRecourcesLeft());
//
        System.out.println("Add coffee bean: ");
        Remaining.Resources.COFFEBEANS.setRecourcesLeft(getInputInt() + Remaining.Resources.COFFEBEANS.getRecourcesLeft());

        System.out.println("Add cups: ");
        Remaining.Resources.CUPS.setRecourcesLeft(getInputInt() + Remaining.Resources.CUPS.getRecourcesLeft());

        Back back = new Back();
        back.getAction();
    }

}
