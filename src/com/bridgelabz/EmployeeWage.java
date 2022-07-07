package com.bridgelabz;

public class EmployeeWage {
    static final int IS_PRESENT=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    public static void main(String[] args) {
        System.out.println("Welcome to employee program");
        int attendence=(int)(Math.floor(Math.random()*10))%2;

        if(attendence==IS_PRESENT) {
            System.out.println("Employee is present");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee wage for a day is:" + dailyWage);
        }
        else
            System.out.println("Employee is absent");
    }
}
