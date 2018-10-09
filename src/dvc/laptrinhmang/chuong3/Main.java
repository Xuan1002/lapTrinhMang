package dvc.laptrinhmang.chuong3;

import java.net.URL;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        try {
            URL url = new URL("https://fotourfo.herokuapp.com/places/");
            System.out.println("URl is " + url.toString());
            System.out.println("\n Protocol is " + url.getAuthority());
            System.out.println("\n File name is " + url.getFile());
            System.out.println("\n Host is " + url.getHost());
            System.out.println("\n Path is "+ url.getPath());
            System.out.println("\n Port is "+ url.getPort());
            System.out.println("default port is "+ url.getDefaultPort());
            System.out.println("query is "+ url.getQuery());
            System.out.println("ref is " + url.getRef());
//           get content
            System.out.println("content is " + url.getContent());
            Object o = url.getContent();
            System.out.println("Endcontentd is "+o.getClass().getName());
            System.out.println("Endcontentd is "+o.getClass().getTypeName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
