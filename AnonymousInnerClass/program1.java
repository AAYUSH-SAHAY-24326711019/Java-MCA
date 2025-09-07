package AnonymousInnerClass;


//when we need to make the object of program1(class).
//at time of the object creation , we will define the method.(see line: )
//such that we its like a class without any name but on compiling
//program1.java we will obtain program1$1.class , that holds the new definition 
//of thesame method display inside the program1

//refer to the link to learn :https://www.youtube.com/watch?v=LNpUj80JLGI


public class program1 {
    int age=20;
    void display(){
        System.out.println("calling display method\n\nShows age ="+age);
    }

    public static void main(String[] args){

        //1. See how we make the Ananymous Inner Class
        program1 obj = new program1(){
            void display(){
        System.out.println("new display method\n\nShows age =("+age+")\n");
        }

     };
        //2. Calling the newly defined method : display
        obj.display();

        //3. calling the older function
        program1 obj2 = new program1();
        obj2.display();

    } 
}

//output:
/*
 * PS C:\Users\Dell\Desktop\Daily\Java-MCA\AnonymousInnerClass> java program1.java
new display method

Shows age =(20)   

calling display method

Shows age =20
 */
