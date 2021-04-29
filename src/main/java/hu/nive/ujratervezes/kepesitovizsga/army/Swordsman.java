package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private static final int SWARDSMAN_STAMINA = 100;
    private static final int SWARDSMAN_DAMAGE = 10;
    private boolean shieldGood;
    private int numberOfDeffence;



    public Swordsman(boolean shieldGood) {
        this.shieldGood = shieldGood;
    }

    @Override
    public void sufferDamage(int damage) {
        if (numberOfDeffence == 1) {
            this.shieldGood = false;
        } else{
            super.sufferDamage(damage);

        }
    }

    @Override
   int doDamage(){
        return 0;
    }
}

