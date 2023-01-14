package com.company.dp.Behavioural.Vistordps.AsyclicApproch;

public abstract class Expression {

    public void accept(IVisitor visitor){
        if (visitor instanceof IExpressionVistor)
            ((IExpressionVistor) visitor).visit(this);
    }
}
