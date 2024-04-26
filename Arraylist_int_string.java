import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        System.out.println("Elements of Integer ArrayList:");
        for (Integer num : intList) {
            System.out.println(num);
        }

        System.out.println("\nElements of String ArrayList:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
