package LoopStructures;

public class floyds {
    public static void main(String args[]){
        int i,j ;
    //outer loop
    for(i=1;i<=5;i++){
        //inner loop
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
//Test 1
// *
// **
// ***
// ****
// *****