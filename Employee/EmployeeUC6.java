package Employee;

public class EmployeeUC6 {
    public static void main(String args[]){
        int EMP_RATE_PER_HOUR = 20;
        int FULL_TIME_HOURS = 8;
        int WORKING_DAYS = 20;

        int monthlyWage = EMP_RATE_PER_HOUR *
                          FULL_TIME_HOURS *
                          WORKING_DAYS;

        System.out.println("Monthly Wage = " + monthlyWage);
    
       
}
}
