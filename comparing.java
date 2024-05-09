class Gen<T extends Number>{
    T numObject;
    Gen(T ob){
        numObject = ob;
    }
    boolean compare(Gen<?> obj2){
        if(numObject.doubleValue()== obj2.numObject.doubleValue())
            return true;
        else
            return false;
    }
}
public class Test{
    public static void main(String args[]){
        Gen<Integer> obj1 = new Gen<Integer>(new Integer(20));
        Gen<Double> obj2 = new Gen<Double>(new Double(20.0));
        boolean flag = obj1.compare(obj2);
        if(flag == true)
            System.out.println("Both values are equal");
        else
            System.out.println("Value differ");
    }
}
