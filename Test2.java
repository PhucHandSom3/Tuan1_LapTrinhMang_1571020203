/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.net.InetAddress;
/**
 *
 * @author phamg
 */
public class Test2 {
    public static void main(String[] args){
        try{
            InetAddress inet=InetAddress.getByName("www.google.com");
            System.out.println("dia chi Ip cua GG.com" + inet.getHostAddress());
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
