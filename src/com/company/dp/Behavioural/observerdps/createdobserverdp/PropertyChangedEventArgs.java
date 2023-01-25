package com.company.dp.Behavioural.observerdps.createdobserverdp;

public class PropertyChangedEventArgs<T> {
    private T source;
    private String propertyName;
    private Object newValue;

    public PropertyChangedEventArgs(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }

    public T getSource() {
        return source;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Object getNewValue() {
        return newValue;
    }
}
