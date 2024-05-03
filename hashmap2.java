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
        
        if(obj.containsKey(32))
        System.out.println(obj.get(32));//Aashish
        
        if(obj.containsKey("Aashish"))
        System.out.println("Value is there...."+);
        
        if(obj.containsKey("32"))
        obj.put(32,"Amit");
        System.out.println(obj);//{32=Aashish, 26=Aashi}
        
        System.out.println("Size of HashMap is: "+obj.size());//Size of HashMap is: 2
        
        obj.clear();
        System.out.println("HashMap is empty...?"+obj.isEmpty());//HashMap is empty...?true
    }
}
