package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
    // UC-2 Employee Wage Calculation
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
     //UC-1 Employee Attendance
    Random r = new Random();
    int empAttendance = r.nextInt() % 2;
    if(empAttendance ==0) {
        System.out.println("Employee is Absent");
    }
    else{
        System.out.println("Employee is Present");
        total_wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Total Wage : "+total_wage);
    }
}

