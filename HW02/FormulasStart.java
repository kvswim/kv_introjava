/** Program to write various expressions and formulas.
 *  EN.600.107, Selinski, Fall 2016
 *  Starter file for homework 02
 */

public class Formulas {

    public static int totalMinutes(int hours, int minutes) {

        int mins;

        // Write Java statement(s) here to convert the hours and minutes to
        // total minutes.

        mins = minutes;  // this is not correct, but is a starting point

        return mins;

    }


    public static int fahrToCels(int fahr) {
   
      int cels;
      
      // Write Java statement(s) here to convert the fahr parameter value to celsius.
      // See http://www.rapidtables.com/convert/temperature/how-fahrenheit-to-celsius.htm
      // Round to the nearest whole degree.
      
      cels = fahr;  // this is not correct, but is a starting point
      
      return cels;
   }

    
   public static double quadRoot(double a, double b, double c) {
   
      double root;
      
      // Write Java statement(s) here to calculate a root (x-value) 
      // of the quadratic equation ax^2 + bx + c = 0
      // See https://en.wikipedia.org/wiki/Quadratic_equation for the formula.
      // You must calculate the root with the + operator in the numerator only.
      
      root = Math.sqrt(b);  // this is not correct, but is a starting point
      
      return root;
   }

    
   public static int blockNum(int row, int col) {

       // Consider a Sudoku puzzle: 9 rows, 9 columns, 9 blocks
       // See https://en.wikipedia.org/wiki/Sudoku and the layouts below
       // for an explanation and numbering detail.

       // For the given row and col paramter values, calculate and return
       // the corresponding block number using the numbering below.
       // For example, row 6, col 7 is in block 8.
       // Hint: take advantage of integer division.

       int block;

       block = 0;  // this is not correct, but is a starting point

       return block;
   }


    public static void main(String[] args) {

        // testing totalMinutes
        System.out.println("should be " + 150 + ", is " + totalMinutes(2, 30));
        System.out.println("should be " + 90 + ", is " + totalMinutes(0, 90));
                           

        // testing fahrToCels
        System.out.println("should be " + -18 + ", is " + fahrToCels(0));
        System.out.println("should be " + 21 + ", is " + fahrToCels(70));

        // testing quadRoot
        System.out.println("should be " + -1.0 + ", is " + quadRoot(2, 4, 2));
        System.out.println("should be " + 1.5297920852749083 + ", is " + quadRoot(3, 100, -160));

        // testing blockNum
        System.out.println("should be " + 3 + ", is " + blockNum(4, 2));
        System.out.println("should be " + 8 + ", is " + blockNum(8, 6));

    }

}



/* here is a layout of the Sudoku grid with row & column numbers for each 
   individual cell, with spacing dividing them into 3x3 blocks

00 01 02  03 04 05  06 07 08
10 11 12  13 14 15  16 17 18
20 21 22  23 24 25  26 27 28

30 31 32  33 34 35  36 37 38
40 41 42  43 44 45  46 47 48
50 51 52  53 54 55  56 57 58

60 61 62  63 64 65  66 67 68
70 71 72  73 74 75  76 77 78
80 81 82  83 84 85  86 87 88

and here is a layout of the corresponding 3x3 block numbers:

0 1 2
3 4 5
6 7 8

*/
