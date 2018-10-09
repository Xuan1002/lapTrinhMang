package dvc.laptrinhmang.chuong2.bai3;

public class Main {
    private int taiKhoan = 10000;

    public Main() {
        System.out.println("Tài khoản hiện có = " + taiKhoan);
    }

    private synchronized void rutTien (int soTienRut) {
        System.out.println("Giao dịch rút tiền đang được thực hiện với" +
                " số tiền = " + soTienRut + "...");

        do{
                System.out.println("Số tiền trong tài khoản không đủ!");
                try {
                    wait(); // phương thức wail sẽ đưa Thread rơi vào trạng thái sleeping
                } catch (InterruptedException ie) {
                    System.out.println(ie.toString());
                }
        } while(taiKhoan < soTienRut);    

        taiKhoan -= soTienRut;
        System.out.println("Rút tiền thành công. Số tiền hiện có trong tài khoản = " + taiKhoan);
    }

    private synchronized void nopTien(int soTienNop) {
        System.out.println("Giao dịch nộp tiền đang được thực hiện với" +
                " số tiền nộp = " + soTienNop + "...");
        taiKhoan += soTienNop;
        System.out.println("Nộp tiền thành công. Số tiền hiện có trong tài khoản = " + taiKhoan);
        notify();
    }

    public static void main(String[] args) {

        final Main customer = new Main();

        Thread t1 = new Thread(){

            public void run() {
                customer.rutTien(50000);
            }

        };

        Thread t2 = new Thread(){
            public void run() {
                customer.nopTien(30000);
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                customer.nopTien(30000);
            }
        };
        //t2.setPriority(4);
        //t1.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }

}
