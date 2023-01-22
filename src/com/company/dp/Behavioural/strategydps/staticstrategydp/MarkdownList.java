package com.company.dp.Behavioural.strategydps.staticstrategydp;

public class MarkdownList implements IListStrategy{

    @Override
    public void start(StringBuilder sb) {

    }

    @Override
    public void addItem(StringBuilder sb, String item) {
        sb.append(" *").append(item).append("\n");
    }

    @Override
    public void end(StringBuilder sb) {

    }
}
