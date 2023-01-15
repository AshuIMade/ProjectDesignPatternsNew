package com.company.dp.Behavioural.Vistordps.classicApproachTwo;

public interface IExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(AddtionExpression e);
    void visit(MultiplicationExpression e);

}
