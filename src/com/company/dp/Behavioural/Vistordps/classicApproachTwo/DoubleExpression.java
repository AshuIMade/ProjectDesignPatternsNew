package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

public class DoubleExpression extends Expression{

    private double value;

    public DoubleExpression(double value){
        System.out.println("Construction double Expression ()");
        this.value=value;
    }
    public double getValue(){
        System.out.println("Getting double value");
        return value;
    }

    @Override
    public void accept(IExpressionVisitor visitor) {
        System.out.println("accept vistors In Double");
        visitor.visit(this);
    }
}
