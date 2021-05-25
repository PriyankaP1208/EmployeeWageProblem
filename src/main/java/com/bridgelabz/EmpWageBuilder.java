package com.bridgelabz;

import java.util.Scanner;

public class EmpWageBuilder {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    //Variables
    public int totalEmpWage;
    private final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int NO_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;

    public EmpWageBuilder(String company, int EMP_RATE_PER_HOUR, int NO_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NO_OF_WORKING_DAYS = NO_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
    }

    //Calculating monthly wage of employee
    public void employeeMonthlyWage() {
        //Variables
        int totalWorkingDays = 0, totalEmpHrs = 0, empHrs = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
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
        }
        System.out.println("Total Employee working hrs:" + totalEmpHrs);
        System.out.println("Total Employee working days:" + totalWorkingDays);
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
    }
    public String toString(){
        return "Total employee wage for "+company+" is :" + totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("This is Employee Wage Computation problem");
        EmpWageBuilder tcs = new EmpWageBuilder("TCS",20,20,100);
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance",10,25,150);
        tcs.employeeMonthlyWage();
        System.out.println(tcs);
        reliance.employeeMonthlyWage();
        System.out.println(reliance);
    }
}
