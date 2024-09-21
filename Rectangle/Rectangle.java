public class Rectangle{
  private Point point;
  private double length;
  private double width;
  
  Rectangle(Point point, double length, double width){
    this.point = point;
    this.length = length;
    this.width = width;
  }
  public Point getPoint(){
    return point;
  }
  public void displayRectangle(){
    point.displayPoint();
    System.out.println("Length: "+ length);
    System.out.println("Width: "+ width);
  }
}
