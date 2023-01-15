package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

import com.company.dp.Behavioural.Vistordps.AsyclicApproch.AdditionExpression;

public class AddtionExpression extends Expression{

    private Expression left;
    private Expression right;
    private int x;
    public int getX(){
        return x;
    }

    public AddtionExpression(Expression left,Expression right){
        System.out.println("Constructing Addtion Expression (). ");
        this.left=left;
        this.right=right;
    }
    public Expression getLeft(){
        System.out.println("Getting left");
        return left;
    }
    public Expression getRight(){
        System.out.println("Getting right");
        return right;
    }

    @Override
    public void accept(IExpressionVisitor visitor) {
        System.out.println("accept vistors In Addtion");
        visitor.visit(this);
    }
}
