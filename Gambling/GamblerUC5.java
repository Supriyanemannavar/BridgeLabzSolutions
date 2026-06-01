package Gambling;

public class GamblerUC5 {
     public static void main(String[] args) {

        int wonDays=0;
        int lostDays=0;
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

            if (stake==150) {
                wonDays++;
            } else {
                lostDays++;
            }

            totalAmount+=(stake-100);
        }

        System.out.println("Won Days = " + wonDays);
        System.out.println("Lost Days = " + lostDays);
        System.out.println("Total Amount = $" + totalAmount);
    }
    
}
