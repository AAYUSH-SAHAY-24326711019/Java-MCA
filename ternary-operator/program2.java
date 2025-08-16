public class program2 {
    public static void main(String args[]){
        System.out.println("Biggest among 3 numbers :");
        int a =10, b=20, c=30;
        int biggest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Biggest number is :"+biggest);

    }
}
/*Biggest among 3 numbers :
Biggest number is :30 */
