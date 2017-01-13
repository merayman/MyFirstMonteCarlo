/*
 * @Author: Musab Erayman
 * @Date: 2.10.2016
 * @class PiCalculator.java main class
 * Monte Carlo Method computation
 * Calculating pi by some geometrical computation. 
 * As a conclusion; more you try, more realistic results you get 
 * and less error rate is calculated.
 */


import java.util.*;

public class PiCalculator{
  public static void main( String[] args ){
    //Variables
    double hits = 0.0;
    double trials;
    
    //Constants
    final double WIDTH = 100.0; 
    final double HEIGHT = WIDTH;
    final double RADIUS = WIDTH / 2;
    final Point CORNER = new Point ( 0.0 , 100.0 );
    final Point CENTER = new Point ( 50.0 , 50.0 );
    final double RATIO = Math.PI / 4.0; 
    
    //Asking user to enter trial
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of trials yo want to do!");
    trials = sc.nextDouble();
    
    //Creating shapes(a rectangle and a circle)
    Rectangle rectangle = new Rectangle( WIDTH, HEIGHT, CORNER );
    Circle circle = new Circle( RADIUS, CENTER );
    
    //Checking whether that random point is inside circle or not
    for (int i = 0; i < trials; i++ ){
      //Creating a random point inside rectangle
      Point randomPoint = rectangle.getRandomPoint();
      if (circle.contains(randomPoint))
        hits++;
    }
    
    //Outputs
    System.out.println(circle.toString());
    System.out.println(rectangle.toString());
    System.out.println( "Number of hits = " + hits );
    System.out.println( "Number of trials = " + trials );
    System.out.println( "Calculated hits / trial ratio by experiment = " + hits  / trials );
    System.out.println( "Expected hits / trial ratio = " + RATIO );
    System.out.println( "Calculated pi by experiment = " + 4 * hits  / trials );
    System.out.println( "Expected pi = " + Math.PI );
    System.out.println( "Error rate of calculated pi = " + (Math.abs( 1.0 - (4 * hits / trials) / Math.PI ) ) * 100.0 + "%." );
  }
}
