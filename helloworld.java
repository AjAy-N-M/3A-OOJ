import java.util.Scanner;
	public class helloworld{
		public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("enter a new number : ");
		int number = reader.nextInt();
		System.out.println("you entered : "+ number);
	}
}