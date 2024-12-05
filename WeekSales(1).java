import java.io.*;
import java.util.*;

public class WeekSales{
   public Scanner inputFile;
   private String line;
   public int wCount = 0;
   public WeekSales(String fileName) throws IOException{
      File file = new File(fileName);
      inputFile = new Scanner(file);
   }
   
   public boolean readNextLine() throws IOException {
      boolean lineRead;
      lineRead = inputFile.hasNext();
      if(lineRead){
         line = inputFile.nextLine();
      }
      return lineRead;
   }
   public double getTotal(){
      double total = 0;
      String[] tokens = line.split(",");
      for(String str : tokens){
         total += Double.parseDouble(str);
      }
      return total;
   }
   public double getAverage(){
      double total = 0;
      double avg;
      String[] tokens = line.split(",");
      for(String str : tokens){
         total += Double.parseDouble(str);
      }
      avg = (double)total/tokens.length;
      return avg;
   }
   public void close() throws IOException{
      inputFile.close();
   }
}

class TestWeekSales {
   //public static WeekSales salesFile = new WeekSales("SalesData.txt");
   public static int Count = 0;
   public static void calcDailyAverage() throws IOException{
      WeekSales salesFile = new WeekSales("SalesData.txt");
      double average;
      double total;
      int weekCount = 1;
      while(salesFile.readNextLine()){
         average = salesFile.getAverage();
         total = salesFile.getTotal();
         System.out.println("Week "+weekCount+": daily average = "+average+"; weekly total = "+total);
         weekCount++;
      }
   }
   public static double calcAllWeekAverage() throws IOException{
      WeekSales salesFile = new WeekSales("SalesData.txt");
      double average;
      double totalAvg = 0;
      //int weekCount = 0;
      while(salesFile.readNextLine()){
         average = salesFile.getTotal();
         totalAvg += average;
         Count++;
      }
      System.out.println("All week total: "+totalAvg);
      return totalAvg/Count;
   }
   public static int maxWeek() throws IOException{
      WeekSales salesFile = new WeekSales("SalesData.txt");
      //Scanner sc = new Scanner(System.in);
      double total = 0;
      int weekCount = 0;
      double maxTotal = 0;
      int max = 0;
      /*while(salesFile.readNextLine()){
         weekCount++;
      }*/
      double[] arr = new double[Count];
      int i = 0;
      while(salesFile.readNextLine()){
         arr[i] = salesFile.getTotal();
         i++;
      }
      
      for(int j =0; j<Count; j++){
         if(arr[j] > maxTotal){
            maxTotal = arr[j];
            max = j+1;
         }
      }
   
      return max;
   }
   public static int minWeek() throws IOException{
      WeekSales salesFile = new WeekSales("SalesData.txt");
      //Scanner sc = new Scanner(System.in);
      double total = 0;
      double maxTotal = 0;
      double[] arr = new double[Count];
      int i = 0;
      while(salesFile.readNextLine()){
         arr[i] = salesFile.getTotal();
         i++;
      }
      int min = 0;
      double minTotal = arr[Count-1];
      for(int j =0; j<Count; j++){
         if(arr[0] < minTotal){
            minTotal = arr[j];
            min = j+1;
         }
      }
   
      return min;
   }
   public static void main(String[] args)throws IOException{
      calcDailyAverage();
      System.out.println("All week sales average: "+calcAllWeekAverage());
      System.out.println("Highest amount of sales in week: "+maxWeek());
      System.out.println("Highest amount of sales in week: "+minWeek());
   }
}