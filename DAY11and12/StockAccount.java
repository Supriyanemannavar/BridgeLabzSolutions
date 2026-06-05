package DAY11and12;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class StockAccount {

    // CompanyShares Class
    static class CompanyShares {
        String symbol;
        int numberOfShares;
        double sharePrice;

        public CompanyShares(String symbol, int numberOfShares, double sharePrice) {
            this.symbol = symbol;
            this.numberOfShares = numberOfShares;
            this.sharePrice = sharePrice;
        }

        public double getValue() {
            return numberOfShares * sharePrice;
        }
    }

    // Transaction Class
    static class Transaction {
        String type;
        String symbol;
        int shares;
        LocalDateTime dateTime;

        public Transaction(String type, String symbol, int shares) {
            this.type = type;
            this.symbol = symbol;
            this.shares = shares;
            this.dateTime = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return type + " | " + symbol + " | " + shares + " shares | " + dateTime;
        }
    }

    // StockAccount Data
    ArrayList<CompanyShares> stocks = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();

    // Constructor
    public StockAccount(String filename) {
        File file = new File(filename);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String symbol = data[0];
                int shares = Integer.parseInt(data[1]);
                double price = Double.parseDouble(data[2]);

                stocks.add(new CompanyShares(symbol, shares, price));
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    // Total Account Value
    public double valueOf() {

        double total = 0;

        for (CompanyShares stock : stocks) {
            total += stock.getValue();
        }

        return total;
    }

    // Buy Shares
    public void buy(int amount, String symbol, double price) {

        for (CompanyShares stock : stocks) {

            if (stock.symbol.equalsIgnoreCase(symbol)) {

                stock.numberOfShares += amount;

                transactions.add(
                        new Transaction("BUY", symbol, amount));

                System.out.println("Shares purchased successfully.");
                return;
            }
        }

        stocks.add(new CompanyShares(symbol, amount, price));

        transactions.add(
                new Transaction("BUY", symbol, amount));

        System.out.println("New stock added successfully.");
    }

    // Sell Shares
    public void sell(int amount, String symbol) {

        for (CompanyShares stock : stocks) {

            if (stock.symbol.equalsIgnoreCase(symbol)) {

                if (stock.numberOfShares >= amount) {

                    stock.numberOfShares -= amount;

                    transactions.add(
                            new Transaction("SELL", symbol, amount));

                    System.out.println("Shares sold successfully.");
                } else {
                    System.out.println("Not enough shares available.");
                }

                return;
            }
        }

        System.out.println("Stock not found.");
    }

    // Save to File
    public void save(String filename) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {

            for (CompanyShares stock : stocks) {

                pw.println(
                        stock.symbol + "," +
                        stock.numberOfShares + "," +
                        stock.sharePrice);
            }

            System.out.println("Data saved successfully.");

        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }

    // Print Report
    public void printReport() {

        System.out.println("\n===== STOCK REPORT =====");

        for (CompanyShares stock : stocks) {

            System.out.println(
                    "Symbol: " + stock.symbol +
                    ", Shares: " + stock.numberOfShares +
                    ", Share Price: " + stock.sharePrice +
                    ", Value: " + stock.getValue());
        }

        System.out.println("\nTotal Account Value: " + valueOf());

        System.out.println("\n===== TRANSACTION HISTORY =====");

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StockAccount account = new StockAccount("stocks.txt");

        while (true) {

            System.out.println("\n1. Buy Shares");
            System.out.println("2. Sell Shares");
            System.out.println("3. View Report");
            System.out.println("4. Save Account");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Symbol: ");
                    String buySymbol = sc.next();

                    System.out.print("Enter Number of Shares: ");
                    int buyShares = sc.nextInt();

                    System.out.print("Enter Share Price: ");
                    double buyPrice = sc.nextDouble();

                    account.buy(buyShares, buySymbol, buyPrice);
                    break;

                case 2:
                    System.out.print("Enter Symbol: ");
                    String sellSymbol = sc.next();

                    System.out.print("Enter Number of Shares: ");
                    int sellShares = sc.nextInt();

                    account.sell(sellShares, sellSymbol);
                    break;

                case 3:
                    account.printReport();
                    break;

                case 4:
                    account.save("stocks.txt");
                    break;

                case 5:
                    account.save("stocks.txt");
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}