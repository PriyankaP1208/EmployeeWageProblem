package com.bridgelabz;

public class EmpWageBuilder {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void EmWageBuilder1() {
        //Variables
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
        EmWageBuilder1();
    }
}
