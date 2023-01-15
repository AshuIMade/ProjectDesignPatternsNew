package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

public class ExpressionPrinter implements IExpressionVisitor{

    private StringBuilder sb= new StringBuilder();

    @Override
    public void visit(DoubleExpression e) {
        System.out.println("---DDDDDD---vist for double expression ");
        sb.append(e.getValue());
    }

    @Override
    public void visit(AddtionExpression e) {
        System.out.println("---AAAAAA---visit for additin expression ");
        sb.append("(");
        e.getLeft().accept(this);
        sb.append("+");
        e.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public void visit(MultiplicationExpression e) {
        System.out.println("---MMMMMM---visit for multiplication expression ");
        sb.append("(");
        e.getLeft().accept(this);
        sb.append("*");
        e.getRight().accept(this);
        sb.append(")");

    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
