package Employee;

public class EmployeeUC7 {
    public static void main(String args[]){
    int EMP_RATE_PER_HOUR = 20;
    int MAX_HOURS = 100;
    int MAX_DAYS = 20;
    

    

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

           int   totalWage=totalHours * EMP_RATE_PER_HOUR;
         System.out.println("Total Employee Wage = " + totalWage);

    }

}
