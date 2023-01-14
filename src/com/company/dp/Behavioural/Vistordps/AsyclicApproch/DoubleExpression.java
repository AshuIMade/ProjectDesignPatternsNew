package com.company.dp.Behavioural.Vistordps.AsyclicApproch;

public class DoubleExpression extends Expression{
    public double value;

    public DoubleExpression(double value){
        this.value=value;
    }
    @Override
    public void accept(IVisitor visitor){
        if (visitor instanceof IDoubleExpressionVistor)
            ((IDoubleExpressionVistor) visitor).visit(this);
    }
}
