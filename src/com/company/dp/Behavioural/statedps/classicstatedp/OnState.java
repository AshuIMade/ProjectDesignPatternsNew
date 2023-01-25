package com.company.dp.Behavioural.statedps.classicstatedp;

public class OnState extends State{

    public OnState(){
        System.out.println("Light is Turned on form OnState(c)! *");
    }

    @Override
    public void off(LightSwitch ls){
        System.out.println("Switching light off from OnState(-)! -");
        ls.setState(new OffState());
    }
}
