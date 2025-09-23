import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class program4 {
    public static void main(String[] args) {
        try {
            InetAddress microSoft = InetAddress.getByName("www.microsoft.com");
            if(microSoft.isReachable(5000)){
                System.out.println("Host is reachable");
            }else{
                System.out.println("Host is unreachable");
            }
        } catch (UnknownHostException e) {
           System.out.println(e.getMessage());
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
