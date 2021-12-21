import java.util.Scanner;
public class main {
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    Systen.out.println("Enter your date");
    int age = scan.nextInt();
    age = 2021 - age ;
    System.out.println(age);
  }
}
