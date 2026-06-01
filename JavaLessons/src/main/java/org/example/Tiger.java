package org.example;

public class Tiger extends Mammal{
    String name;
    public Tiger(String name) {
        this.name = name;
    }
    public void shout(){
        System.out.println(name);
    }
    @Override
    public void walk() {
        System.out.println("Tiger walk");
    }
}
