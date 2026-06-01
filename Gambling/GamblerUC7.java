package Gambling;

public class GamblerUC7 {
    public static void main(String[] args) {

        int totalAmount=0;

        for (int day=1;day<=20;day++) {

            int stake=100;

            while (stake>50&&stake<150) {

                if (Math.random()<0.5) {
                    stake++;
                } else {
                    stake--;
                }
            }

            totalAmount+=(stake-100);
        }

        System.out.println("Total Amount = $" + totalAmount);

        if (totalAmount>0) {
            System.out.println("Continue Gambling Next Month");
        } else {
            System.out.println("Stop Gambling");
        }
    }
    
}
