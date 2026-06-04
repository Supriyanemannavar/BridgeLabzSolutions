package DAY10;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWage {

    interface IEmpWageBuilder {

    void addCompany(String companyName,int wagePerHour,int workingDays,int maxHours);

    void computeWages();

    int getTotalWage(String companyName);
}

//Company Employee Wage Class
static class CompanyEmpWage {

    String companyName;
    int wagePerHour;
    int workingDays;
    int maxHours;
    int totalWage;

    ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName,int wagePerHour,int workingDays,int maxHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHours = maxHours;

        dailyWages = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "\nCompany Name : " + companyName +
                "\nDaily Wages : " + dailyWages +
                "\nTotal Wage  : " + totalWage;
    }
}


static class EmpWageBuilder implements IEmpWageBuilder {

    ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    HashMap<String, CompanyEmpWage> companyMap = new HashMap<>();

    @Override
    public void addCompany(String companyName,
                           int wagePerHour,
                           int workingDays,
                           int maxHours) {

        CompanyEmpWage company =
                new CompanyEmpWage(companyName,
                        wagePerHour,
                        workingDays,
                        maxHours);

        companyList.add(company);
        companyMap.put(companyName, company);
    }

    private int computeCompanyWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < company.maxHours &&
                totalDays < company.workingDays) {

            totalDays++;

            int empHours = 0;

        
            int attendance = (int) (Math.random() * 3);

            switch (attendance) {

                case 1:empHours = 8; // Full Time
                       break;

                case 2:empHours = 4; // Part Time
                       break;

                default:empHours = 0; // Absent
            }

            totalHours += empHours;

            int dailyWage =empHours * company.wagePerHour;

            company.dailyWages.add(dailyWage);
        }

        return totalHours * company.wagePerHour;
    }

    @Override
    public void computeWages() {

        for (CompanyEmpWage company : companyList) {

            int totalWage =computeCompanyWage(company);

            company.setTotalWage(totalWage);

            System.out.println(company);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        if (companyMap.containsKey(companyName)) {
            return companyMap.get(companyName).getTotalWage();
        }

        return 0;
    }
}

// Main Class
public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // Multiple Companies
        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS",20,20,100);

        builder.addCompany("Infosys",25,22,120);

        builder.addCompany("Wipro",30,25,150);

        builder.computeWages();

        // Query Total Wage
        System.out.println("\nTotal Wage of TCS : "
                + builder.getTotalWage("TCS"));

        System.out.println("Total Wage of Infosys : "
                + builder.getTotalWage("Infosys"));

        System.out.println("Total Wage of Wipro : "
                + builder.getTotalWage("Wipro"));
    }
    
}
}
