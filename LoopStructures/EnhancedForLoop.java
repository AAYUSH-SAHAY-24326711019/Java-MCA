package LoopStructures;

public class EnhancedForLoop {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        int ctr=0,sum=0;
        for(int a : arr){
            System.out.print(a);
            sum=sum+a;
            ctr=ctr+1;
        }
        System.out.printf("sum = %d (Total Elements =%d) ",sum,ctr);
        
    }
}
// Test 1
// 12345
// sum = 15 (Total Elements =5) 
