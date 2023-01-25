package com.company.dp.Behavioural.observerdps.createdobserverdp;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
