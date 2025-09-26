package GenericsExamples;

import java.util.ArrayList;
import java.util.List;

public class program5 {

    //upper bound way 
    void printNumbers(List<? extends Number> nums){
        for(Number n : nums){
                System.out.println(n);
        }
    }

    // lower bound way
    void addIntegers(List<? super Integer> l ){
        l.add(10);
        System.out.println(l.get(0));
    }
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        list = new ArrayList<Integer>();
        list.add(0,10);
        //make a list of any type , then set it default as a string
        //then assign it as Integer list
        //this is simple
        program5 obj = new program5();
        obj.printNumbers(list);
    }
}
