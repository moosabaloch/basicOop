package com.company;

import java.util.Scanner;

public class Util {
    public static Student SingleStudentDataInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name = in.nextLine();
        System.out.println("Enter Student Age:");
        int age = in.nextInt();
        return new Student(name, age);
    }

    public static void getMultipleStudent(University obj) {
        Scanner in=new Scanner(System.in);
        boolean docontinue = true;
        char choice;
        do {

            obj.getStudent(SingleStudentDataInput());
            System.out.println("Do you Want to Add More Student: y/n");
            choice=in.next().charAt(0);
            if ((choice=='n'||choice=='N')||(obj.studentCounter==obj.totalNumberofStudent())){
                docontinue=false;
            }
        } while (docontinue);
    }
}
