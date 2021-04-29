package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private static final int HEAVYCAVALRY_STAMINA = 150;
    private static final int HEAVYCAVALRY_DAMAGE = 20;
    private boolean armour = true;
    private int numberOfAttack;

    public HeavyCavalry() {

    }

    @Override
    int doDamage() {
        if(numberOfAttack ==1){
            return HEAVYCAVALRY_DAMAGE * 3;
        }
        else {
            return HEAVYCAVALRY_DAMAGE;
        }

    }
}
