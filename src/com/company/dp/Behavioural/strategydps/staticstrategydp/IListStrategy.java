package com.company.dp.Behavioural.strategydps.staticstrategydp;

public interface IListStrategy {
    void start(StringBuilder sb);
    void addItem(StringBuilder sb,String item);
    void end(StringBuilder sb);
}
