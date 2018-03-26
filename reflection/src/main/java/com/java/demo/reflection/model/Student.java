package com.java.demo.reflection.model;

public class Student
{
    public Student()
    {

    }

    // **********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;
    public String getName()
    {
        return name;
    }
    public void setName( String name )
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge( int age )
    {
        this.age = age;
    }
    public char getSex()
    {
        return sex;
    }
    public void setSex( char sex )
    {
        this.sex = sex;
    }
    public String getPhoneNum()
    {
        return phoneNum;
    }
    public void setPhoneNum( String phoneNum )
    {
        this.phoneNum = phoneNum;
    }
    
    

}
