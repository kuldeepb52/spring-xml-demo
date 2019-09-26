package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name,String gender,int age){
        this.age=age;
        this.gender=gender;
        this.name=name;
    }

    public void getDetails(){
        System.out.println(name+" "+ age+" "+gender );
    }
}
