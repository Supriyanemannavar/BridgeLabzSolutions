package Employee;

public class EmployeeUC5 {
    public static void main(String args[]){
        int Emp_RATE_PER_hOUR=20;
        int HOURS_PER_DAY=8;
        int IS_PRESENT=1;
        int IS_PART_TIME=2;
        int PART_TIME_HOUR=4;
       

        int check=(int)Math.random()*3;
        int hour=0;

        switch(check){

            case 1:hour=HOURS_PER_DAY;
                             break;
            case 2:hour=PART_TIME_HOUR;
                              break;    
            default:hour=0;
                   System.out.println("Employee is Absent");
        }
        int wage=hour*Emp_RATE_PER_hOUR;
        System.out.println("Wage: ");





    }
    
}
