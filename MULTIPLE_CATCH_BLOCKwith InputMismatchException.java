import java.util.*;
class Temp{
  public static void main(String args[])
  {
    try{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st no.: ");
      int a = sc.nextInt();
      System.out.print("Enter 2nd no.: ");
      int b = sc.nextInt();
      int c = a/b;
      System.out.println(args[0]);
  }
  catch(ArithmeticException e){
      System.out.println("Can't divide by zero");
  }
  catch(InputMismatchException e){
  System.out.println("Inappropriate input..");
  }
}
