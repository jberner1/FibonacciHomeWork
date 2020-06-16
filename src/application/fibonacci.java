//Author:Jennifer Berner
//Date: 6/9/2020

package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Scanner;


public class fibonacci extends Application {
	//Recursive method
    public int fibRecursive(int n) {
        //If n is in the 0th or 1st place return n
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    //Iterative method
    public int fibIterative(int n) {
        if (n <= 1)
            return n;
        int fib = 1, prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
    //Display and print running time
    public static void dispTime() {
        long startTime = System.nanoTime();
        System.out.println("time = " + (System.nanoTime() - startTime) + " nanosecs.");
    }

  @Override public void start(Stage stage) {
  	
      stage.setTitle("Fibonacci Line Chart");
      //defining the axes
      final NumberAxis xAxis = new NumberAxis();
      final NumberAxis yAxis = new NumberAxis();
      xAxis.setLabel("Input (n)");
      yAxis.setLabel("Time");
      //creating the chart
      final LineChart<Number,Number> lineChart = 
              new LineChart<Number,Number>(xAxis,yAxis);
              
      lineChart.setTitle("Fibonacci");
      //defining a series
      XYChart.Series series = new XYChart.Series();
      series.setName("Iteration");
      XYChart.Series series2 = new XYChart.Series();
      series2.setName("Recursive");
      //populating the series with data
      fibonacci fib = new fibonacci();
      Scanner input = new Scanner(System.in);

      //System.out.println("Enter a value for n: ");
      //int n = input.nextInt();	

      int n = 5;int n2 = 8; int n3 = 11;int n4 = 15;int n5 = 17;int n6 = 20;int n7 = 22;int n8 = 40;
    //Print out iteration method
      System.out.println("Iterative version:");
      long startTime = System.nanoTime();
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fib.fibIterative(n));
      long q = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n2, fib.fibIterative(n2));
      long q2 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q2);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n3, fib.fibIterative(n3));
      long q3 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q3);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n4, fib.fibIterative(n4));
      long q4 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q4);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n5, fib.fibIterative(n5));
      long q5 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q5);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n6, fib.fibIterative(n6));
      long q6 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q6);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n7, fib.fibIterative(n7));
      long q7 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q7);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n8, fib.fibIterative(n8));
      long q8 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", q8);
      series.getData().add(new XYChart.Data(n,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n2,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n3,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n4,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n5,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n6,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n7,System.nanoTime() - startTime));
      series.getData().add(new XYChart.Data(n8,System.nanoTime() - startTime));

      //Print out recursive method
      System.out.println("Recursive version:");
      startTime = System.nanoTime();
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fib.fibIterative(n));
      long w = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n2, fib.fibIterative(n2));
      long w2 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w2);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n3, fib.fibIterative(n3));
      long w3 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w3);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n4, fib.fibIterative(n4));
      long w4 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w4);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n5, fib.fibIterative(n5));
      long w5 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w5);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n6, fib.fibIterative(n6));
      long w6 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w6);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n7, fib.fibIterative(n7));
      long w7 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w7);
      System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n8, fib.fibIterative(n8));
      long w8 = System.nanoTime() - startTime;
      System.out.printf("Time: %d nanosecs\n", w8);
      series2.getData().add(new XYChart.Data(n,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n2,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n3,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n4,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n5,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n6,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n7,System.nanoTime() - startTime));
      series2.getData().add(new XYChart.Data(n8,System.nanoTime() - startTime));

      
      Scene scene  = new Scene(lineChart,800,600);
      lineChart.getData().addAll(series, series2);
     
      stage.setScene(scene);
      stage.show();
  }

  public static void main(String[] args) {
      launch(args);
  }
}