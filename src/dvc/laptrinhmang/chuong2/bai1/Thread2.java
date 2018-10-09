package dvc.laptrinhmang.chuong2.bai1;

// Thực hiện in các số chẵn nhỏ hơn số nguyên n

public class Thread2 extends Thread{
	private int n;
	
	public Thread2(int n){
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=2;i<=n;i+=2){
			System.out.println("Thread 2: " + i);
		}
	}
	
}
