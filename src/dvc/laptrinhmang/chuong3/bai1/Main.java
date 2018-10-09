package dvc.laptrinhmang.chuong3.bai1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter web name(ex: http://www.sun.com/index.html): ");		
		Scanner sc = new Scanner(System.in);
		String host = sc.nextLine();		
		try {
			URL url = new URL(host);
			System.out.println("File name: "+ url.getFile());
			System.out.println("Host name: "+ url.getHost());
			System.out.println("Port name: "+ url.getPort());
			System.out.println("Protocols name: "+ url.getProtocol());
			System.out.println("Content web: "+ (String)url.getContent());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	      
	     
	}

}
