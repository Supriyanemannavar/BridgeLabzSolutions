package Snakeladder;

public class SnakeUC7 {
    public static void main(String[] args) {

        int player1 = 0;

        int player2 = 0;

        int currentPlayer = 1;

        while(player1 < 100 && player2 < 100) {

            int dice = (int)(Math.floor(Math.random() * 6) + 1);

            int option = (int)(Math.floor(Math.random() * 3));

            if(currentPlayer == 1) {

                if(option == 1) {

                    if(player1 + dice <= 100) {

                        player1 = player1 + dice;
                    }

                    System.out.println("Player 1 Ladder");

                } else if(option == 2) {

                    player1 = player1 - dice;

                    if(player1 < 0) {

                        player1 = 0;
                    }

                    currentPlayer = 2;

                } else {

                    currentPlayer = 2;
                }

                System.out.println("Player 1 Position: " + player1);

            } else {

                if(option == 1) {

                    if(player2 + dice <= 100) {

                        player2 = player2 + dice;
                    }

                    System.out.println("Player 2 Ladder");

                } else if(option == 2) {

                    player2 = player2 - dice;

                    if(player2 < 0) {

                        player2 = 0;
                    }

                    currentPlayer = 1;

                } else {

                    currentPlayer = 1;
                }

                System.out.println("Player 2 Position: " + player2);
            }
        }

        if(player1 == 100) {

            System.out.println("Player 1 Won");

        } else {

            System.out.println("Player 2 Won");
        }
    }
    
}
