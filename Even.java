import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a number");
    int var = scan.nextInt();
    if(var %2 ==0){
      System.out.println("even");
    }else {
      System.out.println("odd");
    }
  }
}
     
