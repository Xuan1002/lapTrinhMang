package dvc.laptrinhmang.chuong3.bai2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter web name(ex: http://www.sun.com/index.html ): ");		
		Scanner sc = new Scanner(System.in);
		String host = sc.nextLine();
		String content;
		try {
			URL url = new URL(host);
			DataInputStream  dis  =  new DataInputStream(url.openStream());
//			DataInputStream  dis  =  new DataInputStream((InputStream) url.getContent());
			while((content = dis.readLine())!=null)
			System.out.println(content);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
