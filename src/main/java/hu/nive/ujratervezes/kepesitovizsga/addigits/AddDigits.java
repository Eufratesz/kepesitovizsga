package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {


    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }


        int sum = 0;
        for (int i = 0; i < input.length(); i++) {

            int number = Integer.parseInt(Character.toString(input.charAt(i)));
            sum += number;
        }
        return sum;
    }
}





