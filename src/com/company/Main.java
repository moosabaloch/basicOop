package com.company;

public class Main {

    public static void main(String[] args) {
        University obj=new University("Fuuast");
        Util.getMultipleStudent(obj);
        obj.displayAllStudent();
    }
}
