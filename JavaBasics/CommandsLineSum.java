package JavaBasics;

public class CommandsLineSum {
    public static void main(String arr[]){
        
        int sum=0;
        int inavlidCount=0;
        try{
        for(int i=0;i<arr.length;i++){
        int a=Integer.parseInt(arr[i]);
        sum+=a;
        }
    }
        catch(NumberFormatException e){
            inavlidCount++;
        }
        
        
     System.out.println(sum);
     System.out.println("Invalid numbers: "+inavlidCount);


    }
    
}
