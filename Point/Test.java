//Shallow copy
public class Test{
  public static void main(String a[]){
      Point point1 = new Point();
      point1.setX(4);
      point1.setY(8);
      //assigning point 1 to point 2
      //both objects have same address
      Point point2 = point1;
      point1.display();
      
      point2.setX(5);
      point2.setY(9);
      point1.display();
      point2.display();  
  }
}
