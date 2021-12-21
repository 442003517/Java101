import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);
    float var;
    System.out.println("Enter a number");
    var = myScanner.nextfloat();
    if (var >= 99 && var < 100){
     System.out.println("A");}
     else if (var >=80 && var < 90){
            System.out.println("B");}
     else if (var >=70 && var < 80){
            System.out.println("C");}
     else if (var >=60 && var < 70){
            System.out.println("D");}
     else if (var >=0 && var < 60){
           System.out.println("F")}
    else { System.out.println("Error You should Enter num betwen 0 - 100 ");}
    
  }
}
       
       
       
      
