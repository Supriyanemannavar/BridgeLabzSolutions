package Gambling;

public class GamblerUC3 {
     public static void main(String[] args) {

        int stake = 100;

        while (stake > 50 && stake < 150) {

            if (Math.random() < 0.5) {
                stake++;
            } else {
                stake--;
            }
        }

        System.out.println("Final Stake = $" + stake);
    }
    
}
