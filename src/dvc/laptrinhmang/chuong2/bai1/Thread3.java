package dvc.laptrinhmang.chuong2.bai1;

// Thực hiện in ra các số từ 1 đến n

public class Thread3 extends Thread{
	private int n;
	
	public Thread3(int n){
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=n;i++){
			System.out.println("Thread 3: " + i);
		}
	}
	
}
