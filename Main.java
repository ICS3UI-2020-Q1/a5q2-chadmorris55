import java.util.Scanner;
/**
 *  counts up tp a number on one line
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for number and records the number
    System.out.println("Please enter a positive integer");
    int number = input.nextInt();
    //loop
    for (int count = 1; count <= number; count++){
      if (count < number){
        //if the count is lower then the inputted one then itll include the commma if its equal then it won't
        System.out.print(count + ",");
      }else{
        System.out.print(count);
      }
      
    }
    
  }
}
