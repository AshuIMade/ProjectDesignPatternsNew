package com.company.dp.Behavioural.Vistordps.clasicApproch;

public class DoubleExpression extends Expression{
    public double value;

    public DoubleExpression(double value){
        this.value=value;
    }
    @Override
    public void accept(IExpressionVistor vistor) {
        vistor.visit(this);
    }
}
