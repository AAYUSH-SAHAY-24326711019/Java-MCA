package If_And_Else;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        // to make the grading system
        Scanner z = new Scanner(System.in);
        int marks;
        System.out.println("Enter total marks out of 100.");
        marks=z.nextInt();
        if(marks>=300 && marks<=500)
            System.out.println("Grade A / First");
        else if(marks>=225 && marks<=300)
            System.out.println("Grade B /Second");
        else if(marks>=150 && marks<=225 )
            System.out.println("Grade C/ Third");
        else if(marks>=0 && marks<150)
            System.out.println("Fail");
        else
            System.out.println("Invalid");

    }
}
/*Enter total marks out of 100.
256
Grade B /Second */