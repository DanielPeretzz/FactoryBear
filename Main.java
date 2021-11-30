package com.homework.daniel;


import com.homework.daniel.Enum.Color;
import com.homework.daniel.Factory.BearFactory;
import com.homework.daniel.Model.GrizzlyBear;
import com.homework.daniel.Model.PandaBear;
import com.homework.daniel.Model.PolarBear;

public class Main {
    static GrizzlyBear grizzlyBear = new GrizzlyBear(12, Color.BROWN,85,true);
    static PolarBear polarBear = new PolarBear(15,Color.WHITE,88,true);
    static PandaBear pandaBear = new PandaBear(11,Color.BLACK_AND_WHITE,99,false);

    public static void main(String[] args) {
        BearFactory bearFactory = BearFactory.getInstance();
        bearFactory.createBear("grizzlybear");
        System.out.println();
        grizzlyBear.eat();
        System.out.println();
        grizzlyBear.mate(grizzlyBear);
        System.out.println();
        grizzlyBear.sleep();
        System.out.println();
        bearFactory.createBear("polarbear");
        System.out.println();
        polarBear.eat();
        System.out.println();
        polarBear.mate(polarBear);
        System.out.println();
        polarBear.sleep();
        System.out.println();
        bearFactory.createBear("pandabear");
        System.out.println();
        pandaBear.eat();
        System.out.println();
        pandaBear.mate(pandaBear);
        System.out.println();
        pandaBear.sleep();

    }


}
