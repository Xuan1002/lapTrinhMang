package dvc.laptrinhmang.chuong2.bai2;

import java.util.Scanner;

//2. Viết chương trình tạo 3 tuyến, trong đó:
// Tuyến 1 cho phép người dùng nhập vào 2 số thực là 2 cạnh của hình chữ
//nhật.
// Tuyến 2 tính diện tích hình chữ nhật ở tuyến 1.
// Tuyến 3 tính chu vi hình chữ nhật ở tuyến 1.
// Tuyến chính chờ các tuyến hoàn thành rồi in kết quả diện tích và chu vi
//của hình chữ nhật lên màn hình.

class hcn implements Runnable{
	static float chieudai=0;
	static float chieurong=0;
	
	static void nhap(){
		System.out.print("Chieu dai: ");
		Scanner sc = new Scanner(System.in);
		chieudai = sc.nextFloat();
		System.out.print("Chieu rong: ");
		chieurong = sc.nextFloat();
		
	//	notifyAll();
	}
	
	synchronized static float tinhchuvi(){

		return (chieudai+chieurong)*2;
	}	

	synchronized static float tinhS(){

		return chieudai*chieurong;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Thread1 {
	public void run(){
		hcn.tinhchuvi();
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hcn h1 = new hcn();
		Thread t1 = new Thread(h1){
			synchronized public void run(){
				System.out.println("Nhap...");
				hcn.nhap();
			}
		};
		t1.start();
		Thread t2 = new Thread(h1){
			synchronized public void run(){
				System.out.println("Tinh chu vi...");
				System.out.println("C = "+hcn.tinhchuvi());	
			}
		};
		t2.start();
		Thread t3 = new Thread(h1){
			synchronized public void run(){
				System.out.println("Tinh S...");
				System.out.println("S = " + hcn.tinhS());
				
			}
		};
		t3.start();
	}

}
