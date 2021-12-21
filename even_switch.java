import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scan = new scanner(System.in);
    int var;
    System.out.println("Enter a number");
    var = scan.nextInt();
    var %= 2;
    switch (var){
      case 0:
        System.out.println("E");
        break;
      default:
        System.out.println("0")
        }
  }
}
        
    
