package com.company.dp.Behavioural.Vistordps.clasicApproch;

public class ClassicVistorDriver {
    public static void driveClassicVistor(){
        System.out.println("hello from Classic Vistor");
        AdditionExpression e= new
                AdditionExpression(new DoubleExpression(1),
                new AdditionExpression( new DoubleExpression(2),new DoubleExpression(3)));
        ExpressionPrinter ep= new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);
        ExpressionCalculator ec= new ExpressionCalculator();
        ec.visit(e);
        System.out.println(ep +"="+ec.result);
    }
}
