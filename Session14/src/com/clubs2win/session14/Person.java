package com.clubs2win.session14;

/**
 * Created by arushi on 8/7/15.
 */
public class Person
{
    private int age;
    private String name;

    public Person()
    {
        age = 999;
        name = "Phantom";
    }

    public Person(int i, String s)
    {
        age = i;
        name = s;
    }

    @Override
    public String toString()
    {
        return "Name:" + name + "\nAge:" + age + "\n\n";
    }
}
