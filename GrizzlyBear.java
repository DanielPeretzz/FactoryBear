package com.homework.daniel.Model;

import com.homework.daniel.Enum.Color;

public class GrizzlyBear extends Bear{
    public GrizzlyBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }

    public void mate(GrizzlyBear other){
        System.out.println("A new grizzly mate");
    }
    public void hunt(){
        System.out.println("grizzly hunting something to eat");
    }

    @Override
    public void eat() {
        System.out.println("grizzly is eating now!");

    }

    @Override
    public void sleep() {
        System.out.println("shhh grizzly sleeping! Zzzzz");

    }
}
