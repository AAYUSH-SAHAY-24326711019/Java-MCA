package DynamicMethodDispatchExample;


/*Meaning of the code in Program 1
 * By the help of Parent Class objec , we are able to call the 
 * child class method.
 */

class BaseClass{
    void show(){
        System.out.println("show() of BaseClass");
    }
}

class SubClass1 extends BaseClass{
    void show(){
        System.out.println("show() of SubClass1");
    }
}



public class program1 {
    public static void main(String[] args) {
        BaseClass obj = new SubClass1();
        obj.show(); //show() of SubClass1
    }
    
}
