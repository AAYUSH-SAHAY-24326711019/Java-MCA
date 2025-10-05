//program for parametrised constructor

package Constructors;

class Test1{
    int x;
    public Test1(int z){
        x=z;
    }
    public void show(){
        System.out.println("The value of x is ="+x);
    }
}


public class program2 {
    public static void main(String args[]){
        Test1 t = new Test1(10);
        t.show();
        Test1 p =new Test1(20);
        p.show();

    }
}
// Test 1
// The value of x is =10
// The value of x is =20