package com.di.xpgold.classes;

public class Student {

    private String name;
    private String course;
    private int age;
    private String grade;

    public Student() {
        super();
    }

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public Student(String name, String course, int age, String grade) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) throws Exception {

        Student firstStudent = new Student();
        System.out.println(" ----- call displayStudentInfo with empty constructor ------");
        firstStudent.displayStudentInfo();

        Student secondStudent = new Student("mr devOps", "Electron", 25);
        System.out.println(" ----- call displayStudentInfo with three parameters in constructor -----");
        secondStudent.displayStudentInfo();

        Student threeStudentd = new Student("mr data scientist", "python", 22, "Senior");
        System.out.println(" ----- call displayStudentInfo all parameters in constructor -----");
        threeStudentd.displayStudentInfo();

    }

    public void displayStudentInfo() {
        System.out.printf("name : <%s> , course : <%s> , age : <%d ans> , grade : <%s>", this.name,
                this.course, this.age, this.grade);
    }

}
