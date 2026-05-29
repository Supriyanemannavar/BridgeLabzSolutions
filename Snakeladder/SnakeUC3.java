package Snakeladder;

public class SnakeUC3 {
    public static void main(String[] args) {

        int position = 0;

        int dice = (int)(Math.floor(Math.random() * 6) + 1);

        int option = (int)(Math.floor(Math.random() * 3));

        if(option == 0) {

            System.out.println("No Play");

        } else if(option == 1) {

            position = position + dice;

            System.out.println("Ladder");

        } else {

            position = position - dice;

            System.out.println("Snake");
        }

        System.out.println("Position: " + position);
    }
    
}
