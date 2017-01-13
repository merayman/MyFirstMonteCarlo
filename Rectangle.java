/*
 * @author: Musab Erayman
 * @date 2.10.2016
 * @class Rectangle.java
 */

public class Rectangle{
  
  //Variables
  double x;
  double y;
  
  double width;
  double height;
  
  //Creating left-bottom corner of the rectangle as a point object
  Point corner = new Point(x,y);
  
  /*
   * Constructor
   * Constructs width, height and corner point of the rectangle
   */
  public Rectangle(double width, double height, Point p){
    this.width = width;
    this.height = height;
    corner = p;
  }
  
  /******Methods*****/
  
  //setter methods
  
  /* 
   * set width of rectangle
   * @param width
   */
  public void setWidth( double width ){
    this.width = width;
  }
  /* 
   * set height of rectangle
   * @param height
   */
  public void setHeight( double height ){
    this.height = height;
  }
  /* 
   * set corner of the rectangle 
   * @param corner
   */
  public void setCorner( Point corner ){
    this.corner = corner;
  }
  
  //getter methods
  
   /* 
   * @return width of rectangle 
   */
  public double getWidth(){
    return width;
  }
   /* 
   * @return height of rectangle
   */
  public double getHeight(){
    return height;
  }
   /* 
   * @return corner of the rectangle
   */
  public Point getCorner(){
    return corner;
  }
  
  /* Method that checks whether the point is inside in rectangle or not
   * @parameter point to check whether is inside rectangle or not
   * @return boolean type if the point is inside rectangle or not
   */
  public boolean contains(Point point){
    if ( corner.getX() - height < point.getX() && point.getX() < corner.getX() && 
        corner.getY() < point.getY() && point.getY() < corner.getY() + width )
      return true;
    return false;
  }
  
  /* 
   * Method that creates a random point inside rectangle
   * @return a random point which is inside rectangle
   */
  public Point getRandomPoint(){
    double x = corner.getX() + Math.random() * width;
    double y = corner.getY() - Math.random() * height;
    Point point = new Point( x, y );
    return point;
  }
  
  /*
   * toString method to state informations of rectangle
   * @return height, width and corner point of the rectangle
   */
  public String toString(){
    return "Rectangle's height is:" + height + ", and width is:" + width + ", and the left-bottom corner point is:" + corner;
  }
}
