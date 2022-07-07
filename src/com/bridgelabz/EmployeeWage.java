package com.bridgelabz;

public class EmployeeWage {
    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to employee program");
        int empRandom = (int) (Math.floor(Math.random() * 10)) % 3;

        if (empRandom == IS_FULL_TIME) {
            System.out.println("Employee is present Full time ");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee wage for a day is:" + dailyWage);
        } else if (empRandom == IS_PART_TIME) {
            System.out.println("Employee is present part time");
            int dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
            System.out.println("Employee wage for a day is:" + dailyWage);
        } else
            System.out.println("Employee is Absent ");
    }
}
