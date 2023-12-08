import java.util.Scanner;
public class Star
{
 public static void main(String args[])
 {
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
 