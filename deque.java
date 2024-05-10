import java.util.*;
class Tesr{
    public static void main(String args[]){
        Deque<String> obj = new LinkedList<String>();
        
        obj.offer("RCB");
        obj.offer("MI");
        obj.offer("SRH");
        obj.offer("XI");
        System.out.println(obj); //[RCB, MI, SRH, XI]
        
        obj.offerFirst("CSK");
        obj.offerLast("RR");
        System.out.println(obj);  //[CSK, RCB, MI, SRH, XI, RR]
        
        obj.poll();
        System.out.println(obj);  //[RCB, MI, SRH, XI, RR]
        obj.pollFirst();
        obj.pollLast();
        System.out.println(obj); //[MI, SRH, XI]

        System.out.println(obj.peek());        //MI
        System.out.println(obj.peekFirst());   //MI
        System.out.println(obj.peekLast());    //XI
        System.out.println(obj);               //[MI, SRH, XI]
        
    }
}
