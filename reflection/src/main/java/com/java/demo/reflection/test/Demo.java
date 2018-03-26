package com.java.demo.reflection.test;

import java.lang.reflect.Field;

import com.java.demo.reflection.model.Student;

public class Demo
{
    public static void main( String[] args )
        throws Exception
    {
        Class<?> studentClass = Class.forName("com.java.demo.reflection.model.Student");
        // get field
        System.out.println("============获取所有的公有字段==============");
        Field[] fieldArray = studentClass.getFields();
        for( Field f : fieldArray ) {
            System.out.println(f);
        }

        System.out.println("===========获取所有的字段，不分公私受保护等==========");
        fieldArray = studentClass.getDeclaredFields();
        for( Field f : fieldArray ) {
            System.out.println(f);
        }

        System.out.println("===========获取共有字段，并调用==========");
        Field f = studentClass.getField("name");
        Object obj = studentClass.getConstructor().newInstance();
        f.set(obj, "Jeff");
        Student student = (Student) obj;
        System.out.println(f);
        System.out.println("Name: " + student.getName());
        
        System.out.println("**************获取私有字段****并调用********************************");  
        f = studentClass.getDeclaredField("phoneNum");  
        System.out.println(f);  
        f.setAccessible(true);//暴力反射，解除私有限定  
        f.set(obj, "18888889999");  
        System.out.println("验证电话：" + student.getPhoneNum());  
    }
}
