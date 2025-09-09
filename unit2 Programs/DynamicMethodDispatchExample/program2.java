package DynamicMethodDispatchExample;

/*
 * Program 2 shows the use of the dynamic method dispatch
 * underlying philosophy is :
 * Laptop(child) is a type of Computer(parent)
 * Reference of parent class runs the method of Type Child Class is Dynamic method dispatch
 */


class Computer{
    void feature(){
        System.out.println("All Computer Features collectively reffered here [parent class Computer]");
    }
}

class Laptop extends Computer{
    void feature(){
        System.out.println("This Computer has feature of compactness and portability");
    }
}



public class program2 {
    public static void main(String[] args) {
        Computer obj = new Laptop();
        obj.feature(); // This Computer has feature of compactness and portability
        obj = new Computer();
        obj.feature(); //All Computer Features collectively reffered here [parent class Computer]
    }
}
