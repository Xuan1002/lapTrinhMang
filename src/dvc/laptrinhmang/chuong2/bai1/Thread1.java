package dvc.laptrinhmang.chuong2.bai1;

// Thực hiện in các số lẻ nhỏ hơn số nguyên n

public class Thread1 extends Thread{
	private int n;
	
	public Thread1(int n){
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=n;i+=2){
			System.out.println("Thread 1: " + i);
		}
	}
	
}
