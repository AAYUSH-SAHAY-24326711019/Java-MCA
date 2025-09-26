package GenericsExamples;
//program for the fixed / Bounded Generic Classes
class Box<T extends Number>{
    private T num;
    public Box(T n){
        num=n;
    }
    public T get(){
        return num;
    }
}
public class program4 {
    public static void main(String[] args) {
        System.out.println("For integer \nBox<Integer> b1 = new Box<>(10);");
        Box<Integer> b1 = new Box<>(10);
        System.out.println("b1 returns :"+b1.get());
        
        System.out.println("For Float \nBox<Float> b2 = new Box<>(10.0f);");
        Box<Float> b2 = new Box<>(10.0f);
        System.out.println("b2 returns :"+b2.get());
    }
}
