package org.projectlombok.homework3;

public class Dog {
    public String nickname;
    public int age;
    public Owner owner;

    public Dog(){
        nickname = "undefined";
        age = -1;
        owner = new Owner();
    }
    public Dog(String nickname, int age, Owner owner){
        this.nickname = nickname;
        this.age = age;
        this.owner = owner;
    }
}
