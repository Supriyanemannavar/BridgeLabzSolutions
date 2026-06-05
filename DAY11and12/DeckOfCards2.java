package DAY11and12;

import java.util.Random;

public class DeckOfCards2{

    // Card Class
    static class Card {
        String rank;
        String suit;

        public Card(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String toString() {
            return rank + " of " + suit;
        }
    }

    // Node for Card Queue
    static class CardNode {
        Card card;
        CardNode next;

        public CardNode(Card card) {
            this.card = card;
        }
    }

    // Queue using Linked List
    static class CardQueue {
        CardNode front;
        CardNode rear;

        public void enqueue(Card card) {

            CardNode node = new CardNode(card);

            if (rear == null) {
                front = rear = node;
                return;
            }

            rear.next = node;
            rear = node;
        }

        public void display() {

            CardNode temp = front;

            while (temp != null) {
                System.out.println(temp.card);
                temp = temp.next;
            }
        }
    }

    // Player Class
    static class Player {

        String name;
        Card[] cards = new Card[9];
        int count = 0;

        CardQueue queue = new CardQueue();

        public Player(String name) {
            this.name = name;
        }

        public void addCard(Card card) {
            cards[count++] = card;
        }

        // Rank Value for Sorting
        private int rankValue(String rank) {

            switch (rank) {
                case "Jack":
                    return 11;
                case "Queen":
                    return 12;
                case "King":
                    return 13;
                case "Ace":
                    return 14;
                default:
                    return Integer.parseInt(rank);
            }
        }

        // Sort Cards by Rank
        public void sortCards() {

            for (int i = 0; i < cards.length - 1; i++) {

                for (int j = i + 1; j < cards.length; j++) {

                    if (rankValue(cards[i].rank)
                            > rankValue(cards[j].rank)) {

                        Card temp = cards[i];
                        cards[i] = cards[j];
                        cards[j] = temp;
                    }
                }
            }

            // Insert Sorted Cards into Queue
            for (Card card : cards) {
                queue.enqueue(card);
            }
        }

        public void printCards() {

            System.out.println("\n" + name + " Cards:");

            queue.display();
        }
    }

    // Node for Player Queue
    static class PlayerNode {
        Player player;
        PlayerNode next;

        public PlayerNode(Player player) {
            this.player = player;
        }
    }

    // Player Queue
    static class PlayerQueue {

        PlayerNode front;
        PlayerNode rear;

        public void enqueue(Player player) {

            PlayerNode node = new PlayerNode(player);

            if (rear == null) {
                front = rear = node;
                return;
            }

            rear.next = node;
            rear = node;
        }

        public void displayPlayers() {

            PlayerNode temp = front;

            while (temp != null) {

                temp.player.printCards();

                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack",
                "Queen", "King", "Ace"
        };

        // Create Deck
        Card[] deck = new Card[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] = new Card(rank, suit);
            }
        }

        // Shuffle Deck
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomIndex =
                    random.nextInt(deck.length);

            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Create Players
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {

            players[i] =
                    new Player("Player " + (i + 1));
        }

        // Distribute 9 Cards Each
        int cardIndex = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 9; j++) {

                players[i].addCard(
                        deck[cardIndex++]);
            }
        }

        // Queue of Players
        PlayerQueue playerQueue =
                new PlayerQueue();

        for (Player player : players) {

            player.sortCards();

            playerQueue.enqueue(player);
        }

        // Print Players and Cards
        playerQueue.displayPlayers();
    }
}
