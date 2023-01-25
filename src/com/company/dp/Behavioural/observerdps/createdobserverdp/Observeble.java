package com.company.dp.Behavioural.observerdps.createdobserverdp;

import java.util.ArrayList;
import java.util.List;

public class Observeble<T> {
    private List<Observer<T>> observers= new ArrayList<Observer<T>>();
    public void subscribe(Observer<T> observer){
        observers.add(observer);
    }
    protected void propertyChanged(T source,String propertyName,Object newValue){
        for (Observer<T> observer:observers){
            observer.handle(new PropertyChangedEventArgs<T>(
                    source,
                    propertyName,
                    newValue
            ));
        }
    }
}
