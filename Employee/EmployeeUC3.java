package Employee;

public class EmployeeUC3 {
    public static void main(String args[]){
        int Emp_RATE_PE_hOUR=20;
        int  HOURS_PER_DAY=8;
        int IS_PRESENT=1;
        

        int check=(int)(Math.random()*2);

        if(check==IS_PRESENT){
            int dayWage=HOURS_PER_DAY*Emp_RATE_PE_hOUR;
            System.out.println("Daily Wage = " + dayWage);


        }else{
            System.out.println("Employee Absent");


        
        }
        


    }
    
}
