package com.company.dp.Behavioural.Vistordps.clasicApproch;

public class ExpressionCalculator implements IExpressionVistor{
    public double result;
    @Override
    public void visit(DoubleExpression e) {
        result=e.value;
    }

    @Override
    public void visit(AdditionExpression e) {
        e.left.accept(this);
        double a=result;
        e.right.accept(this);
        double b=result;
        result= a+b;
    }
}
