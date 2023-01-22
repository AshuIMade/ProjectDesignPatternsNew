package com.company.dp.Behavioural.strategydps.staticstrategydp;


import java.util.List;

public class TextProcessor<LS extends IListStrategy> {

    private StringBuilder sb=new StringBuilder();

    private IListStrategy listStrategy;

    public TextProcessor(IListStrategy listStrategy){
        this.listStrategy= listStrategy;
    }
    public void appendList(List<String> items){
        listStrategy.start(sb);
        for (String item: items)
            listStrategy.addItem(sb,item);
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
