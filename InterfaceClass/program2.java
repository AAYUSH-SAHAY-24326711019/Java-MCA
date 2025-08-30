package InterfaceClass;

interface A1{
   abstract void method1();
}

interface B1 extends A1{
    abstract void method2();
}


public class program2 implements B1{
    public void method1(){
        System.out.println("Defined method 1(from interface A1) acc. to\n program2 class through inheriting/extending A1 interface by B1 interface");
    }
    public void method2(){
        System.out.println("Defined method 2 acc. to program2 class");
    }
    public static void main(String args[]){
        program2 obj = new program2();
        obj.method1();
        obj.method2();
    }
}
