/*
 * @author: Musab Erayman
 * @date 2.10.2016
 * @class Point.java
 */

public class Point{
  
  //Variables
  double x;
  double y;
  
  /*
   * Constructor
   * Constructs x and y coordinates of the point
   */
  public Point( double x, double y ){
    this.x = x;
    this.y = y;
  }
  
  /******Methods*****/
  
  //setter methods
  
  /* 
   * set the x coordinate of point
   * @param x
   */
  public void setX( double x ){
    this.x = x;
  }
  /* 
   * set the y coordinate of point
   * @param y
   */
  public void setY( double y){
    this.y = y;
  }
  
  //getter methods
  
  /* 
   * @return x coordinate of point
   */
  public double getX(){
    return x;
  }
  /*  
   * @return y coordinate of point
   */
  public double getY(){
    return y;
  }
  
  /*
   * toString method to state informations of point 
   * @return coordinates of point
   */
  public String toString(){
    return "X = " + x + ", Y = " + y +  ".";
  }
}
