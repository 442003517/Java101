import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scan = new scanner(System.in);
    System.out.println("Enter a number 1 or 2");
    int num1 = scan.nextInt();
    switch (num1){
      case 1:
      System.out.println("radius");
        float r = scan.nextFloat();
        System.out.println( r * r * 3.14 );
        break;
      case 2:
         System.out.println("heigh")
        float h = scan.nextFloat();
         System.out.println("width")
        float w = scan.nextFloat();
        System.out.println( h * w );
        break;
      default:
        System.out.println("error");
    }
  }
}
        
         
        
