package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int stamina;
    private int damage;


    public MilitaryUnit() {
    }

    abstract int doDamage();

    public void sufferDamage(int damage) {

    }


    public int getStamina() {
        return stamina;
    }

    public int getDamage() {
        return damage;
    }
}
