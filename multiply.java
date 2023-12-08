import java.util.Scanner;
public class multiply {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		scan.close();
		int m = num1*num2;
		System.out.println("Output:"+m);
			}
	}
