/*Program for Default constructor */
package Constructors;

class Test{
    int x;
    public Test(){
        x=5;
    }
    public void show(){
        System.out.println("The value of x is="+x);
    }
}


public class program1{
    public static void main(String args[]){
        Test t = new Test();
        t.show();
        Test p =new Test();
        t.show();
    }
}

//Test1
//The value of x is=5
// The value of x is=5