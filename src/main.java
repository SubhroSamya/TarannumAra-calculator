import java.util.Scanner;
import java.io.*;

/*
 * @ authorTarannum Ara
 */
//* layered architecture..
class main{
	
	public float add(float num1, float num2) {
		float result = num1+num2;
		return result;
	}
	
	public float subtract(float num1,float num2) {
		float result = num1-num2;
		return result;
	}
	
	public float multiply(float num1, float num2) {
		float result = num1*num2;
		return result;
	}
	
	public float divide(float num1, float num2) {
		float result = num1/num2;
		return result;
	}
	
	
 public static void main(String args[]) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		int choice,ch=1; float num1,num2;
		while(ch==1) {
		
			System.out.println("1:add\n2:subtract\n3:multiply\n4:divide");
			choice=sc.nextInt();
		
			System.out.println("give inputs:");
			num1=sc.nextFloat();
			num2=sc.nextFloat();
		
			main cal=new main();
			if(choice==1) {
				System.out.println("addition: "+cal.add(num1, num2));
			}
			else if(choice==2) {
				System.out.println("subtraction: "+cal.subtract(num1, num2));
			}
			else if(choice==3) {
				System.out.println("multiplication: "+cal.multiply(num1, num2));
			}
			else if(choice==4) {
				System.out.println("division: "+cal.divide(num1, num2));
			}
			else
				System.out.println("ERROR");
	
	System.out.println("press 1 to continue:");
	ch=sc.nextInt();
	}
}
}

