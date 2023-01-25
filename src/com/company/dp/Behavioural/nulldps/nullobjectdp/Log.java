package com.company.dp.Behavioural.nulldps.nullobjectdp;

public class Log implements ILog{
    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println("Warning"+ msg);
    }
}
