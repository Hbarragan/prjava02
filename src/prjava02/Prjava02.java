
/*

To change this template, choose Tools | Templates 

and open the template in the editor. 

*/

package prjava02;
import java.io.*; 
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**

*

* @author dc1314daw@gmail.com */

public class Prjava02 {

/**

* @param args the command line arguments */

public static void main(String[] args) { 

    InetAddress addr = null; 
    try {
        addr = InetAddress.getLocalHost();
    } catch (UnknownHostException ex) {
        Logger.getLogger(Prjava02.class.getName()).log(Level.SEVERE, null, ex);
    }
    //byte[] ipAddr = addr.getAddress();
    String hostname = addr.getHostName(); System.out.println("host name="+hostname);
    System.out.println("Nom de l'usuari master: " + System.getProperty("user.name")); System.out.println("Carpeta Personal: " + System.getProperty("user.home")); System.out.println("Sistema operatiu: " + System.getProperty("os.name")); System.out.println("Versió OS: " + System.getProperty("os.version"));


}
}