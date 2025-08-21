// to find the sub array when the sum is 23
package FindSubArray;


public class program1 {
    public static void main(String args[]){
        int arr[] = {15,2,4,8,9,10,23};
        int s,i=0,j=0;
        A1:
        for(i =0; i<=arr.length;i++){
            s=arr[i];
            for(j=i+1;j<arr.length;j++){
                s=s+arr[j];
                if(s==23){
                   // System.out.println(i+"+"+j);
                    break A1;
                }

            }
        }

        for(int k =i ;k<=j;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
// Test 1
// PS C:\Users\Dell\Desktop\Java-MCA\FindSubArray> java .\program1.java
// 2 4 8 9 