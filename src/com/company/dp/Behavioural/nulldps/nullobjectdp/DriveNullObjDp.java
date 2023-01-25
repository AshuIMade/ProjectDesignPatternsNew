package com.company.dp.Behavioural.nulldps.nullobjectdp;

import java.lang.reflect.Proxy;

public class DriveNullObjDp {
    /**@SuppressWarnings("Unchecked")
    public static <T>T noOP(Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                (proxy,method,args)->{
                    if(method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                });
    }*/
    public static void nullObjDriver(){
        Log log=new Log();
        NullLog nullLog=new NullLog();
        BankAccount bankAccount=new BankAccount( nullLog);
        bankAccount.deposite(100);

    }
}
