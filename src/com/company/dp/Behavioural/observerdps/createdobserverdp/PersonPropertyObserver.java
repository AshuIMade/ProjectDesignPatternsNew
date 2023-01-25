package com.company.dp.Behavioural.observerdps.createdobserverdp;

public class PersonPropertyObserver implements Observer<Person> {
    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.getPropertyName()+
                "has changed "+ args.getNewValue());

    }
}
