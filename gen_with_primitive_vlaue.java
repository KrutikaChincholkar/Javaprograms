import java.util.*;

class Gen<T>{
    T a;
    void set(T a){
        this.a = a;
    }
    T get(){
        return a;
    }
}

public class Test{
    public static void main(String args[]){
        Gen<Integer> obj1 = new Gen<Integer>();
        obj1.set(10);
        Integer i1 = obj1.get();
        System.out.println(i1.intValue());
        
        Gen<Float> obj2 = new Gen<Float>();
        obj2.set(26.3f);
        Float f = obj2.get();
        System.out.println(f);
    }
}
