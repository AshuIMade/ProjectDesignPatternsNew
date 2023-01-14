package com.company.dp.Behavioural.Vistordps.clasicApproch;

import com.company.dp.Behavioural.Vistordps.reflectiveApproach.AddtionExpression;

public class AdditionExpression extends Expression{
    public Expression left,right;

    public AdditionExpression(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }

    @Override
    public void accept(IExpressionVistor vistor) {
        vistor.visit(this);
    }
}
