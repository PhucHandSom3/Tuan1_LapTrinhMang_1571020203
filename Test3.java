package javaapplication1;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
/**
 *
 * @author drabu
 */
public class Test3 {

    public static void main(String[] args) {
         try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    if (!address.isLoopbackAddress() && address.isSiteLocalAddress()) {
                        System.out.println("IP Address: " + address.getHostAddress());
                    }
                }
            }
        } catch (SocketException e) {
            System.out.println("Can't get list IP.");
        }
    }
}
