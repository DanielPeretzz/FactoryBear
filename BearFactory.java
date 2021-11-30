package com.homework.daniel.Factory;

import com.homework.daniel.Enum.Color;
import com.homework.daniel.Model.Bear;
import com.homework.daniel.Model.GrizzlyBear;
import com.homework.daniel.Model.PandaBear;
import com.homework.daniel.Model.PolarBear;

import java.util.Random;

 public class BearFactory {

    static BearFactory bearfactory = new BearFactory();

    private BearFactory() {
    }

    public static BearFactory getInstance(){
        return bearfactory;
    }

    Random random = new Random();
    int weight = random.nextInt(150);
    int age = random.nextInt(50);




    public Bear createBear(String bearType) {
        switch (bearType) {
            case "polarbear":
                System.out.println("new Polar Bear created");
                return new PolarBear(age, Color.WHITE, weight, true);

            case "grizzlybear":
                System.out.println("new Grizzly created");
                return new GrizzlyBear(age, Color.BROWN, weight, true);

            case "pandabear":
                System.out.println("new Panda created");
                return new PandaBear(age, Color.BLACK_AND_WHITE, weight, false);

            default:
                return null;
        }
    }
}


