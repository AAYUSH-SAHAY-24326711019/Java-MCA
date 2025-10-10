package InheritanceDemo;

 class Animal{
     
    public  void sound(){
        System.out.println("Animal makes sound");
        
    }
}

class Human extends Animal{
    //
    public void sound(){
        System.out.println("Humans talk with each other");
        // super.sound();
    }

    public void WorkAtOffice(){
        System.out.println("Humans work in office");
    }
}




public class program1 {
    public static void main(String[] args) {
        
        // Animal animal = new Animal();
        // animal.sound();

        Human human = new Human();
        human.sound();

        // human.WorkAtOffice();
    }
}
