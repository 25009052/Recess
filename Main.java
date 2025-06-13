/* MainClass
 * author Sage
 * 2025 June 12
*/
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a year :");

    boolean isLeapYear = false;//cant assume a every year is leap year before checking
    int year = input.nextInt();
    if(year%100==0 && year%400==0){
       isLeapYear = true;//if the year is dividble by 400 and 100 the we can say its leap
    System.out.println(year + " is a leap year and a century year");

    }else if(year%100==0 && year%400!=0){ // The year is not  a leap year but century year
        System.out.println(year + " is not a leap year and a century year");
}
    else if(year%4==0){
        isLeapYear = true;//as the year is dividsble by 4 we can say its leap year
        System.out.println(year + " is leap and non century ");
    }else{
        System.out.println(year + " is not a leap year");
    }
    input.close();
}}