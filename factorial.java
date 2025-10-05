public class factorial {
    public int fact (int val){
        if(val<0)
            return 1;
        if(val==0)
            return 1;
        else    
            return val*fact(val-1);
        
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        int result = f.fact(5);
        System.out.println(result);

    }
}
