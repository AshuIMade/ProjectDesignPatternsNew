package com.company.dp.Behavioural.strategydps.dynamicStrategydp;

public class MarkdownStrategy implements IListStrategy{
    @Override
    public void start(StringBuilder sb) {

    }

    @Override
    public void addList(StringBuilder sb, String item) {
        sb.append(" * ").append(item).append("\n");
    }

    @Override
    public void end(StringBuilder sb) {

    }
}
