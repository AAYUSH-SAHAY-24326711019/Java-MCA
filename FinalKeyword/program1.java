package FinalKeyword;

public class program1 extends FinalClass {
    // if class made final , cannot inherit it gives you an error 
    //The type program1 cannot subclass the final class FinalClassJava(16777529)
//FinalKeyword.FinalClass

// go to FinalClass.java and uncomment the line to 
// public class FinalClass{}

public static void main(String[] args){
    program1 obj = new program1();
    obj.display();
}
}

// //PS C:\Users\Dell\Desktop\Daily\Java-MCA\FinalKeyword> java .\program1.java   
// display function was invoked
