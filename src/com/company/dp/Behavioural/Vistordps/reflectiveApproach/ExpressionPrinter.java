package com.company.dp.Behavioural.Vistordps.reflectiveApproach;

public class ExpressionPrinter {
    public static void print(Expression e, StringBuilder sb){
        if(e.getClass()==DoubleExpression.class){
            sb.append(((DoubleExpression) e).value);
        }else if (e.getClass()==AddtionExpression.class){
            sb.append("(");
            print(((AddtionExpression) e).left,sb);
            sb.append("+");
            print(((AddtionExpression) e).right,sb);
            sb.append(")");
        }
    }
}
