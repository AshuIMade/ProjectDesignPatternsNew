package com.company.dp.Behavioural.Vistordps.reflectiveApproach;

public class AddtionExpression extends Expression{
    public Expression left,right;
    public AddtionExpression(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }
}
