/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.net.InetAddress;
/**
 
 * @author phamg
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress inet=InetAddress.getByName("www.google.com");
            boolean isKN=inet.isReachable(5000);
            if(isKN)
            {
                System.out.println("Co internet");
              
            }
            else
            {
                System.out.println("khong co internet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO code applicatin logic here
    }
    
}
