package com.company.dp.Behavioural.Vistordps.AsyclicApproch;

public class ExpressionPrinter implements IDoubleExpressionVistor, IAdditionExpressionVistor{

    private StringBuilder sb=new StringBuilder();
    @Override
    public void visit(DoubleExpression e) {

        sb.append(e.value);
    }

    @Override
    public void visit(AdditionExpression e) {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
