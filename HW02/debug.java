public class debug {

   public static void main(String[] args) {
   
      int number;
      String word;
      double real;
   
      number = 5;
      word = "start";
      real = 10;
   
      for (int count=1; count<=3; count++) {
         number = number * 3;
         word = word + word.charAt(count);
         real = number / 2.0;
      }
   
   }

}
