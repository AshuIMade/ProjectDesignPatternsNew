package com.company.dp.Behavioural.observerdps.createdobserverdp;

public class Person extends Observeble<Person> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChanged(this,"age",age);
    }
}
