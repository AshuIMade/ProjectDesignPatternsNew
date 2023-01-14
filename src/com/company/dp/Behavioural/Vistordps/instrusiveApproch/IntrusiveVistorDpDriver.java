package com.company.dp.Behavioural.Vistordps.instrusiveApproch;

public class IntrusiveVistorDpDriver {
    public static void driveIntrusiveVistor(){
        System.out.println("Hello from Intrusive vistor Dp");
        AdditionExpression e= new AdditionExpression(new DoubleExpression(2),
                new AdditionExpression( new DoubleExpression(3),new DoubleExpression(5)));
        StringBuilder sb=new StringBuilder();
        e.print(sb);
        System.out.println(sb);
    }
}
