package com.company.people;

public class School {
    private String name;
    private Student[] students;


    public School(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }



    public Student getStudentById(String id) {
        // for a circumstance where an id is not within the bounds of the array in question.
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getId().equals(id)) {
                return this.students[i];
            }
        }
        return null; // if the student is found return the student object else return null.
    }

}
