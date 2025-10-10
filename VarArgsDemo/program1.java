package VarArgsDemo;

class DemoClass{

    public void sumValues(int ...m){
        int sum = 0;
        for(int i = 0; i<m.length; i++){
            sum = sum+m[i];
        }
        System.out.println("The sum = "+sum);
    }
}



public class program1 {
    public static void main(String[] args) {
        DemoClass obj1 = new DemoClass();
        obj1.sumValues(10);
        obj1.sumValues(10,20);
        obj1.sumValues(10,20,30);
    }
    
}

// The sum = 10
// The sum = 30
// The sum = 60