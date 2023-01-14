package com.company.dp.Behavioural.Vistordps.AsyclicApproch;


public class AdditionExpression extends Expression  {
    public Expression left,right;

    public AdditionExpression(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }

    @Override
    public void accept(IVisitor visitor){
        if (visitor instanceof IAdditionExpressionVistor)
            ((IAdditionExpressionVistor) visitor).visit(this);
    }
}
