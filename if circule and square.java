import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scan = new scanner(System.in);
    System.out.println("Enter a number 1 or 2");
    int var1 = scan.nextInt();
    if (var1==1){
      System.out.println("radius");
      float r = scan.nextFloat();
      System.out.println(r * r * 3.14);
    }else if(var1 == 2){
      System.out.println("heigh");
      float h = scan.nextFloat();
      System.out.println("width");
      float w = scan.nextFloat();
       System.out.println(h * w);
    }else{
       System.out.println("error");
    }
  }
}
      
      
