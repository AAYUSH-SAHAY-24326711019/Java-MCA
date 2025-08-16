package If_And_Else;
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = z.nextInt();
        System.out.println("Enter the month");
        int m = z.nextInt();

        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if((y%4==0 && y%100!=0)||(y%4000==0)){
                    System.out.println("29 Days");
                }
                else{
                    System.out.println("28 days.");
                }
            break;

            default:
                System.out.println("Invalid month");
            

        }
        
    }
}
/*
 * Enter the year
2024
Enter the month
2
29 Days
 */