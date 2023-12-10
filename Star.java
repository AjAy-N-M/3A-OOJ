import java.util.Scanner;
public class Star
{
 public static void main(String args[])
 {
    System.out.println("AJAY.N.M\n1BM22CS026");
  int row, column, numberofrows=8;
  for(row=0; row<numberofrows; row++)
  {
   for(column=0; column<=row; column++)
   {
   System.out.print("*");
   }
  System.out.println();
  }
 }
}
 