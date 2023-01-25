package com.company.dp.Behavioural.observerdps.createdobserverdp;

public class ObserverDpDriver {
    public static void driveObserverDp(){
        PersonPropertyObserver po=new PersonPropertyObserver();
        Person p=new Person();
        p.subscribe(po);
        for (int i =0;i<20;i++)
            p.setAge(i);
    }
}
