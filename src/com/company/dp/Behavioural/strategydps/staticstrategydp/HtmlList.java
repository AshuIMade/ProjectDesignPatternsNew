package com.company.dp.Behavioural.strategydps.staticstrategydp;

public class HtmlList implements IListStrategy{
    @Override
    public void start(StringBuilder sb) {
        sb.append(" <ul> ").append("\n");
    }

    @Override
    public void addItem(StringBuilder sb, String item) {
        sb.append(" <li>").append(item).append("</li>").append("\n");
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append(" </ul>").append("\n");
    }
}
