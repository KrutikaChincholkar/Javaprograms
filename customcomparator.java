import java.util.*;

public class Test {
    public static void main(String args[]) {
        Set<Rectangle> set = new TreeSet<>(new RectangleComparator());
        set.add(new Rectangle(4, 4));
        set.add(new Rectangle(4, 4));
        set.add(new Rectangle(8, 4));
        set.add(new Rectangle(9, 4));
        set.add(new Rectangle(6, 4));
        set.add(new Rectangle(2, 4));
        System.out.println("Printing Elements in Sorted Sequence");
        int k = 1;
        for (Rectangle i : set) {
            System.out.println("Perimeter of Rectangle" + k + " is " + i.perimeter());
            k++;
        }
    }
}

class Rectangle {
    int length, breadth;

    Rectangle(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

// Implementing custom comparator
class RectangleComparator implements Comparator<Rectangle> {
    public int compare(Rectangle x, Rectangle y) {
        int perimeter1 = x.perimeter();
        int perimeter2 = y.perimeter();

        if (perimeter1 < perimeter2)
            return +1;
        else if (perimeter1 > perimeter2)
            return -1;
        else
            return 0;
    }
}
