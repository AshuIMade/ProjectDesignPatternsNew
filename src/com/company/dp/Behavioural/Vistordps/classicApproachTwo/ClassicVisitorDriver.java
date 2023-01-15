package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

public class ClassicVisitorDriver {
    public static void driveClassicVisitor(){
        System.out.println("Hello from implementation two of classic Vistor");
        /*AddtionExpression ae=new AddtionExpression(
                new DoubleExpression(2),
                new AddtionExpression(
                        new DoubleExpression(3),
                        new DoubleExpression(5)
                ));
        MultiplicationExpression me= new MultiplicationExpression(
                new AddtionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(2)),
                new MultiplicationExpression(
                        new DoubleExpression(5),
                        new DoubleExpression(5)));**/

        AddtionExpression e2= new AddtionExpression(
                new DoubleExpression(2),
                new DoubleExpression(4)
        );
        ExpressionPrinter ep= new ExpressionPrinter();
        //ep.visit(ae);
        //System.out.println(ep);
        //DoubleExpression d=new DoubleExpression(2);
        ep.visit(e2);
        System.out.println(ep);
    }
}
