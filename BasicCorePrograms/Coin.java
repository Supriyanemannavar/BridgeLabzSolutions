package BasicCorePrograms;
import java.util.*;

public class Coin {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int head=0;
        int tail=0;
        int i=0;
        while(i<n){

            double num=Math.random();
            if(num<0.5){
                head++;
            }else{
                tail++;
            }
            i++;

        }
        System.out.println("Head percentage: "+(head * 100.0) / n);
        System.out.println("Tail percentage: "+(tail* 100.0) / n);



    }
    
}
