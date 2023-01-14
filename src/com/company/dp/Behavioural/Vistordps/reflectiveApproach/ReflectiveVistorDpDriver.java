package com.company.dp.Behavioural.Vistordps.reflectiveApproach;

public class ReflectiveVistorDpDriver {
    public static void DriveReflectiveVistor(){
        System.out.println("Hello form Reflective vistor Dp");
        AddtionExpression e= new AddtionExpression(new DoubleExpression(1),
                new AddtionExpression( new DoubleExpression(2),new DoubleExpression(3)));
        StringBuilder sb=new StringBuilder();
        ExpressionPrinter.print(e,sb);
        System.out.println(sb);
        //main issue here is the code is slow becouse we have to check the class type
        // every time it is to be printed
        // and also breaks the golden rule of encapsulation
    }
}
