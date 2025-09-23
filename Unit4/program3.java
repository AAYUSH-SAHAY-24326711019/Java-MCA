import java.net.InetAddress;
import java.net.UnknownHostException;
// To access the data of the other machine of microsoft

public class program3 {
    public static void main(String[] args) {
        try{
            InetAddress microSoft = InetAddress.getByName("www.microsoft.com");
            System.out.println("Microsoft host name :"+microSoft.getHostName());
            System.out.println("Microsoft host address (IP Addr) :"+microSoft.getHostAddress());
        }catch(UnknownHostException uhe){
            System.out.println(uhe.getMessage());
        }
    }
}
