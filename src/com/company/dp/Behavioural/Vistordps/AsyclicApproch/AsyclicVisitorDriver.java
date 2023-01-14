package com.company.dp.Behavioural.Vistordps.AsyclicApproch;

public class AsyclicVisitorDriver {
    public static void driveAsyclicVisitor(){
        System.out.println("Hello From Asyclic Visitor");
        AdditionExpression e=new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2),new DoubleExpression(3)));
        ExpressionPrinter ep= new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);

    }
}
