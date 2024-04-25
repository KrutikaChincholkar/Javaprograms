import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int val = sc.nextInt();
            if(val < 0)
            {
                IllegalArgumentException obj = new IllegalArgumentException();
                throw obj;
            }
        }
          catch(IllegalArgumentException e){
              System.out.print("Value entered is not feasible");
          }
    }
}
