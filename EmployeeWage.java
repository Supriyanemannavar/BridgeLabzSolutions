

import java.util.ArrayList;
public class EmployeeWage {
    static class Employee {

    // Class Variables
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    // Instance Variable
    String employeeName;

    // Constructor
    Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    // Instance Method
    void calculateWage() {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("--------------------------------");
        System.out.println("Employee Name : " + employeeName);

        // Calculating Wage till condition reaches
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
               totalWorkingDays < NUM_OF_WORKING_DAYS) {

            totalWorkingDays++;

            // RANDOM Attendance Check
            int empCheck = (int) (Math.floor(Math.random() * 3));

            // Switch Case
            switch (empCheck) {

                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Part Time Employee");
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Full Time Employee");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Employee Absent");
            }

            int dailyWage = empHrs * EMP_RATE_PER_HOUR;

            totalEmpHrs = totalEmpHrs + empHrs;

            System.out.println("Day : " + totalWorkingDays);
            System.out.println("Working Hours : " + empHrs);
            System.out.println("Daily Wage : " + dailyWage);
        }

        int totalSalary = totalEmpHrs * EMP_RATE_PER_HOUR;

        System.out.println("--------------------------------");
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalEmpHrs);
        System.out.println("Monthly Wage : " + totalSalary);
    }
}

public class EmployeeWageComputation {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program");

        // Collection Library
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Objects Creation
        employeeList.add(new Employee("Supriya"));
        employeeList.add(new Employee("Rahul"));

        // Calling Instance Method using Objects
        for (Employee emp : employeeList) {
            emp.calculateWage();
        }
    }
}
    
}
