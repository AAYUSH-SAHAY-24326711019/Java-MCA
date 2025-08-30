package InterfaceClass;

interface A{
   abstract void method1();
}

interface B{
    abstract void method2();
}


public class program1 implements A,B{
    public void method1(){
        System.out.println("Defined method 1 acc. to program1 class");
    }
    public void method2(){
        System.out.println("Defined method 2 acc. to program1 class");
    }
    public static void main(String args[]){
        program1 obj = new program1();
        obj.method1();
        obj.method2();
    }
}
