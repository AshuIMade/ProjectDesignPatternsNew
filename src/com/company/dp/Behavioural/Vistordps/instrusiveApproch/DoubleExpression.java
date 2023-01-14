package com.company.dp.Behavioural.Vistordps.instrusiveApproch;

public class DoubleExpression extends Expression{
    private double value;

    public DoubleExpression(double value){
        this.value=value;
    }

    //this is the intruder code which breaks OCP and SRP
    @Override
    public void print(StringBuilder sb) {
        sb.append(value);
    }
}
