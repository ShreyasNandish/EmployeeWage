package com.bridgelabz;

public class EmployeeWage {
    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static int day = 0;
    static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee program");
        int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

        switch (attendance) {
            case IS_FULL_TIME:
                System.out.println("Employee is present Full time ");
                int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee wage for a day is:" + dailyWage);
                int monthlyWage=dailyWage*WORKING_DAY_PER_MONTH;
                System.out.println("Monthly wage of the employee is :"+monthlyWage);
                break;
            case IS_PART_TIME:
                System.out.println("Employee is present Part time ");
                dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                System.out.println("Employee wage for a day is:" + dailyWage);
                monthlyWage=dailyWage*WORKING_DAY_PER_MONTH;
                System.out.println("Monthly wage of the employee is :"+monthlyWage);
                break;
            default:
                System.out.println("Employee is absent");

        }
    }
}
