import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        HashMap<Integer, String> obj = new HashMap<Integer, String>();
        
        obj.put(25, "ABC");
        obj.put(26,"DEF");
        obj.put(32,"GHI");
        
        System.out.println(obj.entrySet()); //[32=GHI, 25=ABC, 26=DEF]
        System.out.println(obj.keySet());   //[32, 25, 26]
        System.out.println(obj.values());   //[GHI, ABC, DEF]
        
        System.out.println(obj);        //{32=GHI, 26=DEF}
        
        obj.remove(25);
        System.out.println(obj); //{32=GHI, 26=DEF]
        
        if(obj.containsKey(32))
            System.out.println(obj.get(32));  //GHI
            
        if(obj.containsValue("GHI"));
            obj.put(32,"KLM");
        System.out.println(obj); // {32=KLM, 26=DEF}
        
        System.out.println("Size of HashMap is: "+obj.size()); //Size of HashMap is: 2

        System.out.println("HashMap is empty..? "+ obj.isEmpty()); //HashMap is empty..? false
        
        
    }
}
