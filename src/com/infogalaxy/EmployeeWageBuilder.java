package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {

    Random r = new Random();
    int empAttendance = r.nextInt() % 2;
    if(empAttendance ==0) {
        System.out.println("Employee is Absent");
    }
    else{
        System.out.println("Employee is Present");
        }


    }
}

