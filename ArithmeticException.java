import java.util.*;
class Krutika{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first no: ");
            int a = sc.nextInt();
            System.out.println("Enter second no: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero ....");
        }
    }
}
