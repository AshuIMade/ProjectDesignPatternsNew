package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

public class MultiplicationExpression extends Expression{

    private Expression left;
    private Expression right;

    public MultiplicationExpression(Expression left,Expression right){
        System.out.println("multiplication Expression construction .()");
        this.left=left;
        this.right=right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(IExpressionVisitor visitor) {
        System.out.println("accept vistors In multiplication");
        visitor.visit(this);
    }
}
