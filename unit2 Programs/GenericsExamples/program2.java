package GenericsExamples;

class Box<T>{
    private T value;
    public void set(T v){
        value=v;
    }
    public T get(){
        return value;
    }
}

public class program2 {
    public static void main(String[] args) {
        System.out.println("Sending in String input :'Hello'");
        Box <String> b1 = new Box<>();
        b1.set("Hello");
        System.out.println("Value inside b1 object :"+b1.get());

        System.out.println("Sending in Integer input :123");
        Box <Integer> b2 = new Box<>();
        b2.set(123);
        System.out.println("Value inside b2 object :"+b2.get());
    }
}
/*
 * Sending in String input :'Hello'
Value inside b1 object :Hello
Sending in Integer input :123
Value inside b2 object :123
 */