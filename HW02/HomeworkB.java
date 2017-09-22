import java.util.Scanner;

/** Program to compute a homework average, based on individual scores
 *  and total possible points.  Prints fail if grade < 60.
 *  Compare to Version B pseudocode in slides, also pasted below.
 */

public class HomeworkB {

/** Main method - start of execution
 *  @param args not used
 */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double grade;
        double sum = 0;
        int points;
        
        System.out.println("enter homework grades, -1 to end");
        grade = in.nextDouble();
            
        while (grade>-1) {
            sum = sum + grade;
            grade = in.nextDouble();
   }

        System.out.print("how many total points possible? ");
        points = in.nextInt();
        grade = sum/points * 100;
        System.out.println("grade is " + grade+"%");
        if (grade < 60)
            System.out.println("fail");
    }

}


/* Pseudocode:

initialize sum to 0
prompt for homework grades, -1 to end
read grade
while grade > -1
   add grade to sum
   read grade

ask for possible points
read points
set grade to be sum/points*100
Display "grade is", grade, "%"
If grade < 60
   Display "fail"


 */
