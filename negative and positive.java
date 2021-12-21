import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scan = new scanner(System.in);
    float var ;
    System.out.println("Enter a number");
    var = scan.nextFloat();
    if (var < 0) {
      System.out.println("negative");
    }else{
      System.out.println("positive");
    }
  }
}
        
