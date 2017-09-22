/** This program is to gain practice writing decision statements in Java.
 *  For Homework #3.
 */
public class Decisions {

   /** Convert a character from a DNA sequence to its complement.
    *  In this problem, 'A' and 'T' are complements of each other, 
    *  as are 'C' with 'G', and '5' with '3'. 
    *  @param ch the character to convert
    *  @return the complementary character if ch is one of 
    *  A, T, C, G, 5, or 3, and return the original character otherwise.
    */
   public static char complement(char ch) {
   
      char comp = ch;   // this will be the complementary character
      comp = Character.toUpperCase(comp); //ensures we always have an uppercase
      // write the statements to do the conversion here
      // hint: you might want to use a switch statement
   switch (comp) {
   case 'A': comp = 'T';
   case 'T': comp = 'A';
   case 'C': comp = 'G';
   case 'G': comp = 'C';
   case '5': comp = '3';
   case '3': comp = '5';
   }
   
   
      return comp;
   }


   /** Figure out the result of a Rock, Paper, Scissors challenge where
    *  Rock beats Scissors, Paper beats Rock and Scissors beats Paper.
    *  See https://en.wikipedia.org/wiki/Rock-paper-scissors for game play.
    *  Results should be case-insensitive (ie, Paper same as paper)
    *  @param first the shape of the first player's hand
    *  @param second the shape of the second player's hand
    *  @return "One" if the first player wins, "Two" if the second
    *  player wins, and "Tie" if nobody wins (same shapes).
    */
   public static String rpsChallenge(String first, String second) {
   
      String result = "";
   
      // write statements to figure out the result here
   
      return result;
   }

   

   /** Main will test the methods above, but you'll have to add more tests.
    *  @param args not used
    */
   public static void main(String[] args) {
   
      // testing complement
      System.out.println("T is correct, computed value is " + complement('A'));
      System.out.println("C is correct, computed value is " + complement('G'));
      System.out.println("P is correct, computed value is " + complement('P'));
   
      // add more tests here so that you have covered all the options for the complement method
   
   
      // testing rpsChallenge
      System.out.println("One is correct, result is " + rpsChallenge("ROCK", "Scissors"));
      System.out.println("Tie is correct, result is " + rpsChallenge("paper", "Paper"));
   
      // add more tests here so that you have covered all the options for the rpsChallenge method
   
      
   }

}
