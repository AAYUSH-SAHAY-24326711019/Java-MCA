import java.net.InetAddress;
import java.net.UnknownHostException;
// To access the data of the local macahine

public class program2{
    public static void main(String[] args) {
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Name of the local Host :"+localHost.getHostName());
            System.out.println("IP address of the local Host : "+localHost.getHostAddress());
        }catch(UnknownHostException uhe){
            System.out.println(uhe.getMessage());
        }

    }
}