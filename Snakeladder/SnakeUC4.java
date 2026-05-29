package Snakeladder;

public class SnakeUC4 {
    public static void main(String[] args) {

        int position = 0;

        while(position < 100) {

            int dice = (int)(Math.floor(Math.random() * 6) + 1);

            int option = (int)(Math.floor(Math.random() * 3));

            if(option == 1) {

                position = position + dice;

            } else if(option == 2) {

                position = position - dice;
            }

            if(position < 0) {

                position = 0;
            }

            System.out.println("Position: " + position);
        }
    }
    
}

