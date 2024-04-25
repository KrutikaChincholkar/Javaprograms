import java.util.Scanner;

public class BadScript {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[5]=30/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error occur" + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Error occur");
        } catch(Exception e){
            System.out.println("Unknow exception occur");
        }
        System.out.println("Thank you");
    }
}
