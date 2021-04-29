package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private static final int ARCHER_STAMINA = 50;
    private static final int ARCHER_DAMAGE = 20;

    private boolean armour = false;

    public Archer() {

    }

    @Override
    int doDamage() {
        return 0;
    }
}
