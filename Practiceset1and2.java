/*Practice set 1 write a java program to demonstrate syntax, logical & runtime errors. 
Practice set 2 write a java program that prints "haha during arithmetic exception and "hehe" during an illegalArgument exception
*/
import java.util.*;
public class ErrorIn{
    public static void main(String[] args){
        //Problem 1
        //Syntax Error - int a=7
        int age = 78;
        int year_born = 200-78;//Logical error
        //System.out.println(6/0);
        //problem 2
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
    }
}
