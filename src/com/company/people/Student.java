package com.company.people;

public class Student extends Person {

    private String id;
    private School school;
    private String grade;

    public Student(String name, int age, String id, School school, String grade) {
        super(name, age);
        this.id = id;
        this.school = school;
        this.grade = grade;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public School getSchool() {
        return school;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return super.getName() + " from " + school.getName();
    }
}
