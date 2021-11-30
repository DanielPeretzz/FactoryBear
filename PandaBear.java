package com.homework.daniel.Model;

import com.homework.daniel.Enum.Color;

public class PandaBear extends Bear {
    public PandaBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }

    public void mate(PandaBear other){
        System.out.println("A new panda mate");
    }

    @Override
    public void eat() {
        System.out.println("panda hunting something to eat");

    }

    @Override
    public void sleep() {
        System.out.println("shhh!!! panda is sleeping Zzzzzz");

    }
}
