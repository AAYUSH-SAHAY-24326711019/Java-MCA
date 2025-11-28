class A {
    void show() {
        System.out.println("A's show");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B's show");
    }
}

public class sb1 {
public static void main(String[] args) {
    B b= new B();
    b.show();
    A obj = new B();   // Upcasting
    obj.show(); 
}
}
