package com.company;


public class University {
    private String name;
    private Student[] arrayOfStudent;
    int studentCounter = 0;

    University(String name) {
        this.name = name;
        arrayOfStudent = new Student[3];
    }

    public void getStudent(Student obj) {
        arrayOfStudent[studentCounter] = obj;
        studentCounter++;
    }

    public int totalNumberofStudent() {
        return arrayOfStudent.length;
    }

    public void displayAllStudent() {
        for (Student s : arrayOfStudent) {
            if (s==null)break;
            System.out.println(s);
        }
    }

}
