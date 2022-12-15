package org.projectlombok.homework3;

public class Owner {
    public String FIO;
    public String address;
    public Owner(){
        FIO = "undefined";
        address = "undefined";
    }
    public Owner(String FIO, String address){
        this.FIO = FIO;
        this.address = address;
    }
}
