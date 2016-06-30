package com.company;

public class Main {

    public static void main(String[] args) {
	    Singleton singleton = Singleton.getInstance();
        singleton.print();
    }
}

class Singleton{
    public static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton(){}

    public void print(){
        System.out.println(this);
    }
}
