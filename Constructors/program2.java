//program for parametrised constructor

package Constructors;

class Test{
    int x;
    public Test(int z){
        x=z;
    }
    public void show(){
        System.out.println("The value of x is ="+x);
    }
}


public class program2 {
    public static void main(String args[]){
        Test t = new Test(10);
        t.show();
        Test p =new Test(20);
        p.show();

    }
}
// Test 1
// The value of x is =10
// The value of x is =20