package com.company.dp.Behavioural.strategydps.dynamicStrategydp;

import java.util.List;

public class TextProcessor {

    private StringBuilder sb=new StringBuilder();

    private IListStrategy listStrategy;

    public TextProcessor(OutputFormat format){
        setOutputFormat(format);
    }

    public void setOutputFormat(OutputFormat format) {
        switch (format){
            case HtmlList:
                listStrategy=new HtmlListStrategy();
                break;
            case Markdown:
                listStrategy=new MarkdownStrategy();
                break;
        }
    }
    public void addItem(List<String> items){
        listStrategy.start(sb);
        for (String item:items) {
            listStrategy.addList(sb,item);
        }
        listStrategy.end(sb);
    }

    public void clear(){
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
