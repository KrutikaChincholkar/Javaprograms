import java.util.*;
class TestMap{
    public static void main(String args[]){
        Map<String, Integer> hashMap = new HashMap<String , Integer>();
        hashMap.put("Smi", 30);
        hashMap.put("Sma", 31);
        hashMap.put("Sme", 29);
        hashMap.put("Smy", 25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+ "\n");
    }
}
