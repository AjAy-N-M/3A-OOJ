import java.util.Scanner;
public class javaexample {
	public static void main(String[] args){
		System.out.println("AJAY.N.M\n1BM22CS026");
		int num;
		System.out.println("enter a integer:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num % 2 == 0){
			System.out.println(" even number");}
		else
			{System.out.println(" odd number");
			}
	}
}