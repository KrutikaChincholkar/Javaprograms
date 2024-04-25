import java.util.Scanner;
public class BadScript {
    public static void main(String[] args) {
        String[] names = {"abcd", "efg", "hij", "klm", "nop"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer to get the name at that position rang(0-4): ");
            int index = scanner.nextInt();
            
            System.out.println("Name int the requested position " + index + " is: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
