package JavaBasics;
import java.util.*;

public class StringEqual {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

String  str1=sc.nextLine();
String str2=sc.nextLine();

equal(str1,str2);

    
}
public static void equal(String str1,String str2){

    if(str1.equals(str2)){
        System.out.println("two strings are equal");
    }
    else{
        System.out.println("two Strings are not equal");
    }
}


}
