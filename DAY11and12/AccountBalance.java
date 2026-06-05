package DAY11and12;
import java.util.*;

public class AccountBalance {

    static class Account{

        int balance=1000000;

        public void debit(int amount){
             
            if(AccountTest.amountCheck(balance, amount)){
                balance-=amount;
                System.out.println("Amount has been debited");
            }
            else{
                System.out.println("Debit amount exceeded account balance.");
            }
        }

    }

    static class AccountTest{

        public static  boolean amountCheck(int balance,int amount){
            if(balance<amount){
                return false;
            }
            return true;
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the amount");
        int n=sc.nextInt();

        Account account=new Account();
        account.debit(n);
        sc.close();

    }
    
}
