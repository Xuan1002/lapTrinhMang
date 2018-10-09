package dvc.laptrinhmang.chuong3.bai3;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
public class EX5 {
    public static void main(String args[]) throws Exception {

        URL u = new URL("https://fotourfo.herokuapp.com/places/");
        URLConnection uc = u.openConnection();
        System.out.println("Date Create: " + new Date(uc.getDate()));
        System.out.println("Last modified: " + new Date(uc.getLastModified()));
        System.out.println("Expiration date: " + new Date(uc.getExpiration()));
    }
}
