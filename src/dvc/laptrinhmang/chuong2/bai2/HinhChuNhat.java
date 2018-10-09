package dvc.laptrinhmang.chuong2.bai2;

import java.util.Scanner;

public class HinhChuNhat extends Thread {

    public static int x=0, y=0, s, v;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Thread luong1 = new Thread() {
            public void run() {
                do {
                    System.out.println("Nhập vào chiều dài: ");
                    x = scanner.nextInt();
                    System.out.println("Nhập vào chiều rộng: ");
                    y = scanner.nextInt();
                } while (x <= 0 || y <= 0 || x < y);
                synchronized(this){
                    this.notify();
                }
            }
        };

        Thread luong2 = new Thread() {
            public void run() {
                s=x*y;
            }
        };

        Thread luong3 = new Thread() {
            public void run() {
                v = (x + y) * 2;
                synchronized (this){
                    this.notify();
                }
            }
        };

        Thread luong4 = new Thread() {
            public void run() {
                System.out.println("Chiều dài: " + x + "\nChiều rộng: " + y);
                System.out.println("Diện tích: " + s + "\nChu vi: " + v);
            }
        };
        luong1.start();
        synchronized (luong1){
            luong1.wait();
        }
        luong2.start();
        synchronized (luong2){
            luong2.wait();
        }
        luong3.start();
        synchronized (luong3){
            luong3.wait();
        }
        luong4.start();
    }
}
