package com.bridgelabz;

public class EmployeeWage {
    static final int IS_PRESENT = 1;

    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;


    public void employeeWageComputation(String company, int WAGE_PER_HOUR, int WORKING_DAY_PER_MONTH) {
        int totalHours=0;
        int totalWage=0;
        int day=0;

        while (totalHours < 100 && day <= 20) {
            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

            switch (attendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present Full time ");
                    int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWage = totalWage + dailyWage;
                    System.out.println("Employee wage for a day is:" + dailyWage);
                    int monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                    System.out.println("Monthly wage of the employee is :" + monthlyWage);
                    totalHours = totalHours + FULL_DAY_HOUR;
                    day++;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is present Part time ");
                    dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                    totalWage = totalWage + dailyWage;
                    System.out.println("Employee wage for a day is:" + dailyWage);
                    monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                    System.out.println("Monthly wage of the employee is :" + monthlyWage);
                    totalHours = totalHours + PART_DAY_HOUR;
                    day++;
                    break;
                default:
                    System.out.println("Employee is absent");

            }
        }
        System.out.println("The total wage for the company printing is "+company);
        System.out.println("The total working hours is : " + totalHours);
        System.out.println("The total working days is : " + day);
        System.out.println("Total wage of the employee is :" + totalWage);
        System.out.println("The total wage per hour is : " +WAGE_PER_HOUR);
        System.out.println("Total wage of the employee is :" + totalWage);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee program");
        EmployeeWage ew1 = new EmployeeWage();
        EmployeeWage ew2 = new EmployeeWage();
        ew1.employeeWageComputation("Dmart",10,16);
        ew2.employeeWageComputation("Asian",4,15);
    }
}
