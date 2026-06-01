package Gambling;

public class GamblerUC2 {
    public static void main(String[] args) {

        int stake = 100;

        if (Math.random() < 0.5) {
            stake++;
            System.out.println("Won $1");
        } else {
            stake--;
            System.out.println("Lost $1");
        }

        System.out.println("Current Stake = $" + stake);
    }
    
}
