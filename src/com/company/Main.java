package com.company;

import com.company.people.Person;
import com.company.people.School;
import com.company.people.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // try blocks, catch blocks and finally blocks have
        // different scopes.

//        School school = new School("David Beckham High");
//        Student student = new Student("Abitha", 23, "he009", school, "9");
//        try {
//            school.getStudentById("harry");
//        } catch (NullPointerException e) {
//            e.printStackTrace();
////            System.out.println("Student not found");
//        } finally {
//            System.out.println(student.getName());
//        }

//        try {
//            sleepAndOpenFile("/home/wayne/Documents/java/projects/SDA/StudentManagement/StudentManagement.im");
//            System.out.println("The file was found.");
//        } catch (InterruptedException e) {
//            System.out.println("Thread was disrupted. Please run again.");
//        } catch (FileNotFoundException e) {
//            System.out.println("Sorry, the file in question was not found.");
//        }
//


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your address: ");
//        String address = "";
//        System.out.print("Enter you age: ");
//        int age = scanner.nextInt();
//        if (age < 18 || address.isEmpty()) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        System.out.println("The age entered is: " + age);



        // Exercises: Use what you've been taught so far in collections.

        // 25 mins.
        // Create a method that takes an array of integers and returns a new array,
        // sorted in ascending order. (smallest to biggest).
        // HINT: the Set interface has implementations to covert to an array.
        // if the function's argument is null, an empty array. Then throw and properly manage
        // an IllegalArgumentException.


        // Create a method that takes a string and returns a string that has been stripped of its duplicates.
        // For example:
        // I am I a boy that goes to to school.
        // output: am I a boy that goes to school. (the order is not needed in this case).


    }
//
//    public static void sleepAndOpenFile(String filePath) throws InterruptedException, FileNotFoundException {
//        Thread.sleep(2000);
//        new FileReader(filePath);
//    }
}
