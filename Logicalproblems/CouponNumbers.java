package Logicalproblems;

import java.util.HashSet;
import java.util.Random;

public class CouponNumbers {

    public static int generateRandom(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    public static int collectCoupons(int n) {
        HashSet<Integer> coupons = new HashSet<>();
        int count = 0;

        while (coupons.size() < n) {
            int coupon = generateRandom(n);
            coupons.add(coupon);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;

        int total = collectCoupons(n);

        System.out.println("Total random numbers needed = " + total);
    }
}
