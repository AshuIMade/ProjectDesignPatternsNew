package com.company.dp.Behavioural.statedps.classicstatedp;

public class State {
    public void on(LightSwitch ls){
        System.out.println("Light is Already On! from State(-) *");
    }
    public void off(LightSwitch ls){
        System.out.println("Light is Already Off! from State(-) -");
    }
}
