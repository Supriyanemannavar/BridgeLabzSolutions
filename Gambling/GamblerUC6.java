package Gambling;

public class GamblerUC6 {
    public static void main(String[] args) {

        int luckiestDay=0;
        int unluckiestDay=0;

        int maxProfit = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        for (int day=1;day<=20;day++) {

            int stake=100;

            while (stake>50&&stake<150) {

                if (Math.random() < 0.5) {
                    stake++;
                } else {
                    stake--;
                }
            }

            int profit=stake-100;

            if (profit>maxProfit) {
                maxProfit=profit;
                luckiestDay=day;
            }

            if (profit<maxLoss) {
                maxLoss=profit;
                unluckiestDay=day;
            }
        }

        System.out.println("Luckiest Day = " + luckiestDay);
        System.out.println("Unluckiest Day = " + unluckiestDay);
    }
    
}
