package Employee;

public class EmployeeUC8 {
    static final int EMP_RATE_PER_HOUR = 20;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    public static int computeEmpWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours <= MAX_HOURS &&
               totalDays < MAX_DAYS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);

            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = 4;
                    break;
                case 2:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
        }

        return totalHours * EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {

        int totalWage = computeEmpWage();

        System.out.println("Total Employee Wage = " + totalWage);
    }
    
}
