class Shape{
      public int  x,y;
      void printArea(){
            System.out.println("prints the area of a shape");
      }
}
class Rectangle extends Shape{
      void printArea(){
           System.out.println("area Of rectangle is "+x*y);
     }
}
public class Overrid{
      public static void main(String[] ards){
          Rectangle r=new Rectangle();
          r.x=10;
          r.y=20;
          r.printArea();
  }
}