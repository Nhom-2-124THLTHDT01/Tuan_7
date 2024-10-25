package Java.DemoTuan6.Bai3;

import java.util.Scanner;

public class TKTT extends TaiKhoan {
    private double soDuTT;
    private double TTTienD;
    private double TTTienN;
    private boolean dathanhtoantd;
    private boolean dathanhtoantn;
    private Scanner sc;
    
    public TKTT(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau, double soDuTT, double TTTienD, double TTTienN) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.soDuTT = soDuTT;
        this.TTTienD = TTTienD;
        this.TTTienN = TTTienN;
        this.dathanhtoantd = false;
        this.dathanhtoantn = false;
        this.sc = new Scanner(System.in);
    }

    public double getsoDuTT() {
        return soDuTT;
    }

    public void setsoDuTT(double soDuTT) {
        this.soDuTT = soDuTT;
    }

    public void napTien() {
        System.out.printf("Nhap so tien muon nap: ");
        double soTien = Double.parseDouble(sc.nextLine());

        if (soTien > 0) {
            soDuTT += soTien;
            setSoDu(getSoDu() - soTien); // Cập nhật số dư trong tài khoản cơ bản
            System.out.println("Nap tien thanh cong! So tien trong tai khoan tiet kiem: " + soDuTT);
        } else {
            System.out.println("So tien khong hop le!");
        }
    }

    public void rutTien() {
        System.out.printf("Nhap so tien muon rut: ");
        double soTien = Double.parseDouble(sc.nextLine());

        if (soTien > 0 && soTien <= soDuTT) {
            soDuTT -= soTien;
            setSoDu(getSoDu() + soTien); // Cập nhật số dư trong tài khoản cơ bản
            System.out.println("Rut tien thanh cong! So tien con trong tai khoan tiet kiem: " + soDuTT);
        } else {
            System.out.println("So tien du khong du de thuc hien giao dich!");
        }
    }

    public void ThanhToanTD() {
        if (dathanhtoantd == false) {
            soDuTT -= TTTienD;
            System.out.printf("Thanh toan thanh cong! So tien hien con trong tai khoan: " + soDuTT);
            dathanhtoantd = true;
        } else {
            System.out.println("Da thanh toan tien dien thang nay.");
        }
    }

    public void ThanhToanTN() {
        if (dathanhtoantn == false) {
            soDuTT -= TTTienN;
            System.out.printf("Thanh toan thanh cong! So tien hien con trong tai khoan: " + soDuTT);
            dathanhtoantn = true;
        } else {
            System.out.println("Da thanh toan tien nuoc thang nay.");
        }
    }
}
