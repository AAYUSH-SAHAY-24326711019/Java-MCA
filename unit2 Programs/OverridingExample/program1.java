package OverridingExample;

/*Method Overriding
 * 
 * works in inheritance.
 * Both parent and child class has display method of same parameters
 * invoking the object of child class runs the method in child class 
 * invoking the object of the parent class runs parent class method.
 * 
 * Consider : calling child_class_obj.display() led to search into 
 * body of ChildClass , found and executed. If it was not present
 * then the method present in the BaseClass will be invoked.
 * 
 * We see that the ChildClass display method overrides the definition
 * of the display() method in the Base Class
 */



 class BaseClass{
    public void display(){
        System.out.println("Identified as display() from BaseClass(parent)");
    }
}

 class SubClass extends BaseClass{
    public void display(){
        System.out.println("Identified as display() from SubClass(Child)");
    }
}

public class program1 {
    
    public static void main(String[] args) {
        BaseClass mno = new BaseClass();
       mno.display(); //Identified as display() from BaseClass(parent)
       SubClass obj = new SubClass();
       obj.display(); // Identified as display() from SubClass(Child)
    }
}
