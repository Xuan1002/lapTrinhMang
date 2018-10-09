package dvc.laptrinhmang.chuong2.bai1;

//1. Viết chương trình tạo ra 4 tuyến thực hiện các công việc sau:
// Thực hiện in các số lẻ nhỏ hơn số nguyên n
// Thực hiện in các số chẵn nhỏ hơn số nguyên n
// Thực hiện in ra các số từ 1 đến n
// Thực hiện in các ký tự hoa trong bảng mã ASCII

public class Main {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1(10);
		Thread2 t2 = new Thread2(10);
		Thread3 t3 = new Thread3(10);
		Thread4 t4 = new Thread4(10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
