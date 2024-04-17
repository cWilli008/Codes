import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // Create an instance of the Stock subclass
        Stock stockManager = new Stock();

      //scan user to search stock
        System.out.println("Hello, what Stock would you like to search?: ");
        String symbolToSearch = scanner.nextLine();

     //call method from subclass
        stockManager.searchStock(symbolToSearch);

     //stock to add
        System.out.println("\nEnter the symbol, name, and price of the stock you'd like to add: ");
        String newSymbol = scanner.nextLine();
        String newName = scanner.nextLine();
        double newPrice = scanner.nextDouble();
        stockManager.addStock(newSymbol, newName, newPrice);


//stock to remove
        System.out.println("Enter the symbol of the stock you'd like to remove: ");
        String symbolToRemove = scanner.next();
            stockManager.removeStock(symbolToRemove);

        // Save stocks to file
        stockManager.saveStockToFile("C:\\Users\\Cimone\\Desktop\\Stocks.csv");

        // Read stocks from file
        stockManager.readStockFromFile("C:\\Users\\Cimone\\Desktop\\Stocks.csv");

        scanner.close();

      }

        }






