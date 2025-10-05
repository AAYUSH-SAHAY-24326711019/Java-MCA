package LoopStructures;

public class labelledFor {
    public static void main(String args[]){
        int i,j;
        A1:
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.println(j);
                if(j==3)
                   break A1;
                
            }
            System.out.println();
        }
    }
}
//Output :123