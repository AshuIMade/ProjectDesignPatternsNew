package com.company.dp.Behavioural.strategydps.dynamicStrategydp;

public class HtmlListStrategy implements IListStrategy{
    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>").append("\n");
    }

    @Override
    public void addList(StringBuilder sb, String item) {
        sb.append("    <li>").append(item).append("</li>").append("\n");
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>").append("\n");
    }
}
