package dvc.laptrinhmang.chuong3.bai4;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class EX4 {
    public static void main(String[] args) {
        try {
//            getbyname
            InetAddress ip = InetAddress.getByName("www.facebook.com");

            System.out.println("Host Name " + ip.getHostName());
            System.out.println("IP Address " + ip.getHostAddress());
//            getlocal
            InetAddress ip_item1 = InetAddress.getLocalHost();
            System.out.println(ip_item1.getHostAddress());
            System.out.println(ip_item1.getHostName());
            //            System.out.println("IP Address " + ip.getlo);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
