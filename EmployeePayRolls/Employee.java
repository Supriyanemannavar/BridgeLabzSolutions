package EmployeePayRolls;

public class Employee {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    // Class Method with Parameters
    public static int computeEmployeeWage(String company,
                                          int empRatePerHour,
                                          int maxWorkingDays,
                                          int maxWorkingHours) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < maxWorkingHours
                && totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);

            int empHours = 0;

            // UC4 - Switch Case
            switch (empCheck) {

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        int totalEmpWage = totalEmpHours * empRatePerHour;

        System.out.println("\nCompany : " + company);
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalEmpHours);
        System.out.println("Total Wage : " + totalEmpWage);

        return totalEmpWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // Employee Present or Absent
        int attendance = (int) (Math.random() * 2);

        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        //Daily Wage
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = wagePerHour * fullDayHour;

        System.out.println("Daily Employee Wage : " + dailyWage);

        // Part Time Wage
        int partTimeHour = 4;
        int partTimeWage = wagePerHour * partTimeHour;

        System.out.println("Part Time Employee Wage : " + partTimeWage);

        // Monthly Wage and Condition
        computeEmployeeWage("TCS", 20, 20, 100);

        // Multiple Companies
        computeEmployeeWage("Infosys", 25, 22, 120);

        computeEmployeeWage("Wipro", 30, 25, 150);
    }
    
}
