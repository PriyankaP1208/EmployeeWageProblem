package com.bridgelabz;
interface EmployeeWage{
    void computeEmpWage(CompanyEmpWage companyEmpWage);
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
        }
        System.out.println("Total Employee working hrs:" + totalEmpHrs);
        System.out.println("Total Employee working days:" + totalWorkingDays);
        int totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHr;
        System.out.println("Total employee wage for " + companyEmpWage.company + " is "+ totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println("This is Employee Wage Computation problem");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        CompanyEmpWage[] company = new CompanyEmpWage[3];
        company[0] = new CompanyEmpWage("TCS",20,40,80);
        empWageBuilder.computeEmpWage(company[0]);
        company[1] = new CompanyEmpWage("Reliance",25,45,100);
        empWageBuilder.computeEmpWage(company[1]);
        company[2] = new CompanyEmpWage("Atos",30,35,90);
        empWageBuilder.computeEmpWage(company[2]);
    }
}

class CompanyEmpWage{
    int empRatePerHr, wagePerHour, workingDays, workingHours;
    String company;
    public CompanyEmpWage(String company, int empRatePerHr, int workingDays, int workingHours)
    {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }
}
