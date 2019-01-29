package pt.caires.hackerrank.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


class Student
{
    private String name;
    private String id;
    private String email;

    public String getName()
    {
        return name;
    }

    public void setId(final String id)
    {
        this.id = id;
    }

    public void setEmail(final String email)
    {
        this.email = email;
    }

    public void anothermethod()
    {
    }
}

public class Reflection
{
    public static void main(final String[] args)
    {
        final Class student = Student.class;
        final Method[] methods = student.getDeclaredMethods();

        final ArrayList<String> methodList = new ArrayList<>();
        for (final Method m : methods)
        {
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for (final String name : methodList)
        {
            System.out.println(name);
        }
    }
}
