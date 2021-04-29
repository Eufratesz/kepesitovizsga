package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit>army = new ArrayList<>();


    public int getArmySize() {
        return army.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }


    public int getArmyDamage() {

        int count = 0;
        List<Integer>damages = new ArrayList<>();
        for(int damage : damages){
            count += damage;
        }
        return count;
    }

    public void damageAll(int damage) {
        
    }
}
