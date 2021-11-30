package com.homework.daniel.Model;

import com.homework.daniel.Enum.Color;

public class PolarBear extends Bear{


    public PolarBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }


    public void mate(PolarBear other){
        System.out.println("A new polar bear mate!");
    }
    public void hunt(){
        System.out.println("polar bear hunting something to eat");
    }

    @Override
    public void eat() {
        System.out.println("polar bear eating now");

    }

    @Override
    public void sleep() {
        System.out.println("shhh!!! polar bear is sleeping Zzzzzz");
    }



}
