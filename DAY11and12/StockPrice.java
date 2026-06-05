package DAY11and12;
import java.util.*;

public class StockPrice {

    static class Stock {
    String stockName;
    int shareNumber;
    int sharePrice;

    public Stock(String stockName, int shareNumber, int sharePrice) {
        this.stockName = stockName;
        this.shareNumber = shareNumber;
        this.sharePrice = sharePrice;
    }

    
    public int calculateValue() {
        return shareNumber * sharePrice;
    }
}


static class StockPortfolio {
    ArrayList<Stock> stocks = new ArrayList<>();


    public void addStock(Stock stock) {
        stocks.add(stock);
    }

   
    public void printReport() {
        int totalValue = 0;

        for (Stock stock : stocks) {
            int stockValue = stock.calculateValue();

            System.out.println("Stock Name    : " + stock.stockName);
            System.out.println("No of Shares  : " + stock.shareNumber);
            System.out.println("Share Price   : " + stock.sharePrice);
            System.out.println("Stock Value   : " + stockValue);
            System.out.println();

            totalValue += stockValue;
        }

        System.out.println("Total Stock Value : " + totalValue);
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter Number of Stocks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Details of Stock " + i);

            System.out.print("Stock Name: ");
            String name = sc.nextLine();

            System.out.print("Number of Shares: ");
            int shareNumber = sc.nextInt();

            System.out.print("Share Price: ");
            int sharePrice = sc.nextInt();
            sc.nextLine();

            Stock stock = new Stock(name, shareNumber, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
        sc.close();   
    
}
}

