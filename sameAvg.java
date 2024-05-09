class Stats<T extends Number>{
    T[] nums;
    Stats(T[] o){
        nums = o;
    }
    double average(){
        double sum =0.0;
        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    boolean same_Avg(Stats<?> ob){
        if(average()== ob.average())
            return true;
       // else
        return false;
    }
}
public class Test{
    public static void main(String args[]){
        Integer a[] ={1,2,3,4,5};
        Stats<Integer> obj1 = new Stats<Integer>(a);
        System.out.println("Average is: "+ obj1.average());
        
        Double d[]={1.8,2.3,3.1,4.5,5.9};
        Stats<Double> obj2 = new Stats<Double>(d);
        System.out.println("Average is: "+ obj2.average());
        
        if(obj1.same_Avg(obj2))
            System.out.println("Average values are equal");
        else
            System.out.println("Average differ");
    }
}
