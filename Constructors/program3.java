// program for the copy constructor

package Constructors;

class Test2{
    int x;
    public Test2(int x){
        this.x=x;
    }
    public void show(){
        System.out.println("Value = "+x);
    }
}

public class program3 {
    public static void main(String args[]){
        System.out.println("Making object of Test : obj1\n-> Test obj1 = new Test(100);");
        Test2 obj1 = new Test2(100);
        System.out.println("Making object of Test : obj2\n-> Test obj1;");
        Test2 obj2;
        System.out.println("Copy constructor will run here: obj2\n-> obj2=obj1;");
        obj2=obj1;
        System.out.println("Calling the show method by object 2 \n-> obj2.show()");
        System.out.println("The Results are :");
        obj2.show();
    }
}
// Test 1
// Making object of Test : obj1
// -> Test obj1 = new Test(100);
// Making object of Test : obj2
// -> Test obj1;
// Copy constructor will run here: obj2
// -> obj2=obj1;
// Calling the show method by object 2
// -> obj2.show()
// The Results are :
// Value = 100