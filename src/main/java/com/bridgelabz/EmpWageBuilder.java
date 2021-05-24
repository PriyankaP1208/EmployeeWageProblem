package com.bridgelabz;

import java.util.Scanner;

public class EmpWageBuilder {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static void EmpWageBuilder(String company, int EMP_RATE_PER_HOUR, int NO_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS)
        {
            int empHrs = 0;
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck){
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee present part-time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: "+totalWorkingDays + "     Employee Hrs: "+empHrs);
            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage:" + empWage);
        }
        System.out.println("Total employee wage:" + totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println("This is Employee Wage Computation problem");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Company name: ");
        String company = scan.next();
        System.out.println("Enter Wage per hour: ");
        int EMP_RATE_PER_HR = scan.nextInt();
        System.out .println("Enter Maximum working days in month: ");
        int NO_OF_WORKING_DAYS = scan.nextInt();
        System.out.println("Enter maximum working hours in month: ");
        int MAX_HRS_IN_MONTH = scan.nextInt();
        EmpWageBuilder(company,EMP_RATE_PER_HR,NO_OF_WORKING_DAYS,MAX_HRS_IN_MONTH);
    }
}
