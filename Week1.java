/******************************
  week1.java  Joe Favaro 
*******************************/

public class Week1 
{
   public static void main(String[] args)
   {
      // line comment - ignored by java compiler
      System.out.print("Begin a program by going to File -> New ");
      System.out.println("Then do Save As");
      
      String day="Thursday";                                                              // Delcaring the 'day' variable
      System.out.println();                                                               // Adding an empty line
      System.out.println("Today is " + day);                                              // Printing out the 'day' variable
      
      int favoriteNumber;                                                                 // Declaration statement
      favoriteNumber=63;                                                                  // Assign variable a value
      System.out.println(favoriteNumber);                                                 // Output 'favoriteNumber' int variable
      System.out.println("My favorite number is " + favoriteNumber + ". That's it");      // Outputting 'favoriteNumber' in the middle of two quotations
      
      favoriteNumber=13;
      
   }  // end main

}  // ends class