package AbstractClasses;


abstract class A{
    // one abstract method

    abstract void display(); // abstract method : a prototype / without definition
    //function

    //function with definition
    void show(){
        System.out.println("Show function invoked.");
    }
}

class program1 extends A{
    public void display(){
        System.out.println("display method invoked");
    }
    public static void main(String[] args){
        program1 obj = new program1();
        obj.show();
        obj.display();
    }
}