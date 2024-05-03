import java.util.*;
public class Test{
    public static void main(String arg[]){
        HashMap<Integer, String> obj = new HashMap<Integer, String>();
        obj.put(25, "Vineet");
        obj.put(26, "Aashi");
        obj.put(32,"Aashish");
        
        System.out.println(obj.entrySet()); //[32=Aashish, 25=Vineet, 26=Aashi]
        System.out.println(obj.keySet());//[32, 25, 26]
        System.out.println(obj.values());//[Aashish, Vineet, Aashi]
        
        System.out.println(obj);//{32=Aashish, 25=Vineet, 26=Aashi}
        
        obj.remove(25);
        System.out.println(obj);//{32=Aashish, 26=Aashi}
    }
}
