package JUnitTestingProblems;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static List<Integer> usedNotes = new ArrayList<>();
    static int totalNotes = 0;

    public static void findChange(int amount, int index) {

        // base condition
        if (amount == 0 || index == notes.length) {
            return;
        }

        int note = notes[index];

        if (amount >= note) {

            int count = amount / note;
            amount = amount % note;

            for (int i = 0; i < count; i++) {
                usedNotes.add(note);
                totalNotes++;
            }
        }

        findChange(amount, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        findChange(amount, 0);

        System.out.println("\nMinimum number of notes: " + totalNotes);
        System.out.println("Notes returned: " + usedNotes);
    }
}