package Unit3;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class program1{
    public static void main(String[] args) {
        try {
            //getting details of the local machine
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host name :"+localHost.getHostName());
            System.out.println("Local Host IP address :"+localHost.getHostAddress());
            //getHostAddress() return string value for ip address

            //getting details of remote connected device
            InetAddress msAddress = InetAddress.getByName("www.microsoft.com");
            System.out.println("IP address of site :"+msAddress.getHostAddress());

            //to check whether remote server reachable or not
            if(msAddress.isReachable(5000)){
                System.out.println("Host is reachable");
            }else{
                System.out.println("Host is un-reachable");
            }
        } catch (UnknownHostException e) {
            e.getMessage();
        }
        catch(IOException ie){
            ie.getMessage();
        }
    }
}

/*output
 * 
Local Host name :Aayush
Local Host IP address :
IP address of site :23.0.254.92
Host is reachable
 */
