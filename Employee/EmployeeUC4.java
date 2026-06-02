package Employee;

public class EmployeeUC4 {
    public static void main(String args[]){
        int Emp_RATE_PER_hOUR=20;
        int HOURS_PER_DAY=8;
        int IS_PRESENT=1;
        int IS_PART_TIME=2;
        int PART_TIME_HOUR=4;

        int check=(int)Math.random()*3;
        int totalWage=0;

        if(check==IS_PRESENT){
            totalWage=HOURS_PER_DAY*Emp_RATE_PER_hOUR;

        }
        else if(check==IS_PART_TIME){
            totalWage=Emp_RATE_PER_hOUR*PART_TIME_HOUR;

        }
        else {
            System.out.println("Emplyoee is Absent");
        }
        System.out.println("Employee Wage: "+totalWage);
    }
    
}
