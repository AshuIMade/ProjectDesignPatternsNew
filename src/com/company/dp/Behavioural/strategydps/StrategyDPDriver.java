package com.company.dp.Behavioural.strategydps;

import com.company.dp.Behavioural.strategydps.dynamicStrategydp.OutputFormat;
import com.company.dp.Behavioural.strategydps.dynamicStrategydp.TextProcessor;
import com.company.dp.Behavioural.strategydps.staticstrategydp.HtmlList;
import com.company.dp.Behavioural.strategydps.staticstrategydp.IListStrategy;
import com.company.dp.Behavioural.strategydps.staticstrategydp.MarkdownList;

import java.util.ArrayList;
import java.util.List;


public class StrategyDPDriver {
    public static void driveStrategyDp(){
        //List<String> items= new ArrayList<String>(){"Actualite","Legalite","Feternite"};
        //TextProcessor tp= new TextProcessor(OutputFormat.Markdown);

        List<String> list=new ArrayList<String>();
        list.add("Liberite");
        list.add("legalite");
        list.add("Fternite");
        //tp.addItem(list);
        //System.out.println(tp);
        //tp.clear();

        //tp.setOutputFormat(OutputFormat.HtmlList);
        List<String> list2=new ArrayList<String>();
        list2.add("encapsulation");
        list2.add("inheritance");
        list2.add("polymorphysim");
        //tp.addItem(list2);
        //System.out.println(tp);

        IListStrategy ls= new MarkdownList();
        System.out.println("-----------Static Implementation----------");
        com.company.dp.Behavioural.strategydps.staticstrategydp.TextProcessor<MarkdownList> tps=
                new com.company.dp.Behavioural.strategydps.staticstrategydp.TextProcessor<MarkdownList>(ls);
        tps.appendList(list);
        com.company.dp.Behavioural.strategydps.staticstrategydp.TextProcessor<HtmlList> tps2=
                new com.company.dp.Behavioural.strategydps.staticstrategydp.TextProcessor<HtmlList>(new HtmlList());
        tps2.appendList(list2);


    }
}
