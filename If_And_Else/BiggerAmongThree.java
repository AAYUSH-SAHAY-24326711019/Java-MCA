package If_And_Else;
import java.util.Scanner;
public class BiggerAmongThree {
    public static void main(String args[]){
        int first,second,third,biggerNo=0;
        Scanner z = new Scanner(System.in);
        System.out.println("Enter 1st number ->");
        first= z.nextInt();
        System.out.println("Enter 2nd number ->");
        second= z.nextInt();
        System.out.println("Enter 3rd number ->");
        third= z.nextInt();

        if(first==second && first==third){
            System.out.println("The values are equal");
            biggerNo=first;
        }
        else if(first>second){
            if(first>third)
                biggerNo=first;
            else
                biggerNo=third;

        }
        else if(second>third){
            biggerNo=second;
        }
        else{
            biggerNo=third;
        }

        System.out.println("Biggest among  is :"+biggerNo);
            

    }
}
/*Test 1
 * Enter 1st number ->
10
Enter 2nd number ->
20
Enter 3rd number ->
30
Biggest among  is :30
 */

 /*Test 2
  * 
  Enter 1st number ->
10
Enter 2nd number ->
10
Enter 3rd number ->
20
Biggest among  is :20
  */

  /*Test 3
   * 
   Enter 1st number ->
0
Enter 2nd number ->
0
Enter 3rd number ->
0
The values are equal
Biggest among  is :0
   */

//    Test 4
//    Enter 1st number ->
// 1
// Enter 2nd number ->
// 1
// Enter 3rd number ->
// 1
// The values are equal
// Biggest among  is :1
