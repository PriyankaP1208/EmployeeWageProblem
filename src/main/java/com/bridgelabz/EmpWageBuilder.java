package com.bridgelabz;

import java.util.ArrayList;

interface EmployeeWage{
    public void computeEmpWage(CompanyEmpWage companyEmpWage);
}

public class EmpWageBuilder implements EmployeeWage {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Calculating monthly wage of employee
    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
        //Variables
        int totalWorkingDays = 0, totalEmpHrs = 0, empHrs = 0;
        while (totalEmpHrs <= companyEmpWage.workingHours && totalWorkingDays < companyEmpWage.workingDays) {
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
            companyEmpWage.empWage = empHrs * companyEmpWage.empRatePerHr;
            System.out.println("Total Employee working hrs:" + totalEmpHrs);
        }
        System.out.println("Total Employee working days:" + totalWorkingDays);
        int totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHr;
        companyEmpWage.empMonthlyWage = empHrs * companyEmpWage.empRatePerHr;
        System.out.println("Total employee wage for " + companyEmpWage.company + " is " + companyEmpWage.empMonthlyWage);
    }

    public static void main(String[] args) {
        System.out.println("This is Employee Wage Computation problem");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        ArrayList<CompanyEmpWage> array = new ArrayList<>();
        array.add(new CompanyEmpWage("TCS", 20, 40, 100));
        empWageBuilder.computeEmpWage(array.get(0));
        array.add(new CompanyEmpWage("Reliance", 25, 45, 100));
        empWageBuilder.computeEmpWage(array.get(1));
    }
}

class CompanyEmpWage{
    int empRatePerHr, workingDays, workingHours, empWage, empMonthlyWage;
    String company;
    public CompanyEmpWage(String company, int empRatePerHr, int workingDays, int workingHours)
    {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }
}
