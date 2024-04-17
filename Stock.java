import java.io.*;
import java.util.HashMap;

//import to store the files
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;
import java.io.Writer;

import java.util.List;
import java.util.Map;

public class Stock extends Main {

    //wanna use hashmap (key,value,_ ) paid
    private Map<String, List<Object>> Tinker = new HashMap<>();

    public Stock() {
        //declare Stocks
        this.Tinker = new HashMap<>();
        Tinker.put("Tinker", List.of("Stock", "Price")); // maybe declare that way it stays on top of exel
        Tinker.put("DIS", List.of("Disney", 43.22));
        Tinker.put("T", List.of("AT&T", 32.55));
        Tinker.put("TES", List.of("Tesla", 229.33));
        Tinker.put("COST", List.of("Cosco", 133.32));
        Tinker.put("GOOGLE", List.of("Google", 502.33));

    }
    //call method when looking up stocks
    public void searchStock(String symbolToSearch) {
        if( Tinker.containsKey(symbolToSearch)) {
            List<Object> stockInfo = Tinker.get(symbolToSearch);
            System.out.println("The Stock Found is:");
            System.out.println("Name: " + stockInfo.get(0));
            System.out.println("Symbol: " + symbolToSearch);
        } else {
            System.out.println("Stock not found for symbol: " + symbolToSearch);
        }
    }
    // Method to add a new stock
    public void addStock(String symbol, String name, double price) {
        Tinker.put(symbol, List.of(name, price));
    }

    // Method to remove a stock
    public void removeStock(String symbol) {
        Tinker.remove(symbol);
    }
            //Open file for writing
    public void saveStockToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Cimone\\Desktop\\Stocks.csv"))) {
            for (Map.Entry<String, List<Object>> entry : Tinker.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //reading from file
     public void readStockFromFile(String filePath) {
         try (BufferedReader reader = new BufferedReader(new FileReader("Stocks.csv"))) {
             String line;

             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
             reader.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
        }





