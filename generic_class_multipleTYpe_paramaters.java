import java.util.*;

class Gen<T1, T2>{
    T1 object1;
    T2 object2;
    Gen(T1 ob1, T2 ob2){
        object1 =ob1;
        object2 =ob2;
    }
    T1 getObject1(){
        return object1;
    }
    T2 getObject2(){
        return object2;
    }
    void showObjects(){
        System.out.println("Class of object1: "+object1.getClass());
        System.out.println("Class of object2: "+object2.getClass());
    }
}

public class Test{
    public static void main(String args[]){
        Gen<String, Integer> obj1 = new Gen<String, Integer>("Hello", 35);
        System.out.println(obj1.getObject1());
        System.out.println(obj1.getObject2());
        obj1.showObjects();
        
        Gen<Integer, Double> obj2 = new Gen<Integer, Double>(35, 56.8);
        System.out.println(obj2.getObject1());
        System.out.println(obj2.getObject2());
        obj2.showObjects();
        
    }
}
