/*
 * @author: Musab Erayman
 * @date 2.10.2016
 * @class Circle.java
 */

public class Circle{
  //Variables
  double x;
  double y;
  double radius;

  //Creating center of the circle as a point object
  Point center = new Point (x,y);
  
  /*
   * Constructor
   * Constructs radius and center point of the circle
   */
  public Circle ( double radius, Point p ){
    center = p;
    this.radius = radius;
  }
  
  /******Methods*****/
  
  //setter methods
  
  /* 
   * set radius of circle
   * @param radius
   */
  public void setRadius( double radius ){
    this.radius = radius;
  }
  /* 
   * set center of the circle
   * @param center
   */
  public void setCenter( Point center ){
    this.center = center;
  }
  
  //getter methods
  
  /* 
   * @return radius of circle
   */
  public double getRadius(){
    return radius;
  }
  /* 
   * @return center point of circle
   */
  public Point getCenter(){
    return center;
  }
  
  /*
   * Method that checks whether the point is inside in circle or not
   * @param point to check whether it is inside circle or not
   * @return boolean type whether point is inside circle or not
   */
  public boolean contains(Point point){
    if ( Math.pow( point.getX() - center.getX(), 2 ) + Math.pow( point.getY() - center.getY(), 2 ) < Math.pow( radius, 2 ) )
      return true;
    return false;
  }
  
  /* 
   * toString method to state informations of circle 
   * @return radius and center point of circle
   */
  public String toString(){
    return "Radius of circle is:" + radius + " and the center of the circle is point:" + center;
  }
}
