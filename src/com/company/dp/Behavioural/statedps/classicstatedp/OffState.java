package com.company.dp.Behavioural.statedps.classicstatedp;

public class OffState extends State{
    public OffState(){
        System.out.println("Turning LightSwitch Off form OffState(c)! -");
    }
    @Override
    public void on(LightSwitch ls){
        System.out.println("Turning the lightSwitch on from OffState(-)! *");
        ls.setState(new OnState());
    }
}
