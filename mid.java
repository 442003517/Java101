import java.util.Scanner;
public class Mid
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("floating point number between 0 to 10");
	float num1 = scan.nextFloat();
	num1 = num1/10*100;
	if (num1<0&&num1>100){
	System.out.println("Error");
	}else if (num1<50){
	 System.out.println("is less than 50%");
	}else if (num1>=50){
	System.out.println("is greater 50%");
	}
	
	
	
	}
}
