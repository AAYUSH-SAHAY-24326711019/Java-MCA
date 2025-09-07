package InnerClassDemo;


public class OuterClass{
    int age=21;
    void disp(){
        System.out.println("disp method [OuterClass method]\nprints age value = "+age);
    }

    class InnerClass{
        void show(){
            System.out.println("Inside the show method of InnerClass");
        }
    }

    public static void main(String[] args){

        //1. lets make the object of outer class and call its method.
        OuterClass obj_OC = new OuterClass();
        obj_OC.disp();

        //2. lets make the object of the inner class and call its method.
        OuterClass.InnerClass obj_IC = obj_OC.new InnerClass();
        obj_IC.show();

    }
}
//output
/*PS C:\Users\Dell\Desktop\Daily\Java-MCA\InnerClassDemo> java .\OuterClass.java
disp method [OuterClass method]
prints age value = 21
Inside the show method of InnerClass */


