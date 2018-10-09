package dvc.laptrinhmang.chuong2.bai1;

// Thực hiện in các ký tự hoa trong bảng mã ASCII

public class Thread4 extends Thread{
	private int n;
	
	public Thread4(int n){
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=66;i<=76;i++){
			System.out.println("Thread 4: " + (char)i);
		}
	}
	
}
