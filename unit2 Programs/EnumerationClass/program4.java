package EnumerationClass;
import java.util.Scanner;
import java.lang.Enum;

/*Program to make the Enum class
 * 
 * we can make the variables and the constructors in the Enums.
 * Enums in class will also have a fixed value to its objects
 * The enums can have access modifiers as well as getter and setter methods
 */

 
 enum Laptop{
    //price in dollars
    MacBook(2000),XPS(2200),Surface(450),Thinkpad(150); //similar to constructors after objects.
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    public void getPrice(){
        System.out.println(price);;
    }
    public void setPrice(int price){
        this.price=price;
    }
 }

public class program4 {
    public static void main(String[] args) {
        Laptop l = Laptop.Thinkpad;
        //1. telling the super class of the enums class
        System.out.println("laptop.getClass().getSuperclass() : "+l.getClass().getSuperclass());
        int id=0; 
        Scanner z = new Scanner(System.in);
        Laptop collect[] = Laptop.values();
        //2.make the menu and tell the price:
        System.out.println("See the table and give id to print the price");
        System.out.println("id  Name");
        System.out.println("1   MacBook\n2  XPS\n3  Surface\n4  Thinkpad");
        while(true){
            System.out.println("User Give id :");
            id= z.nextInt();
            switch(collect[id-1].ordinal()){
                case 0: collect[id].getPrice(); break;
                case 1: collect[id].getPrice(); break;
                case 2: collect[id].getPrice(); break;
                case 3: collect[id].getPrice(); break;
                default:    System.out.println("Provide valid choice (ctrl+c to exit)");
            }
        }
    }
}
/*output
 * laptop.getClass().getSuperclass() : class java.lang.Enum
See the table and give id to print the price
id  Name      
1   MacBook   
2  XPS        
3  Surface    
4  Thinkpad   
User Give id :
1
2200
User Give id :
2
450
User Give id :
3
150
 */