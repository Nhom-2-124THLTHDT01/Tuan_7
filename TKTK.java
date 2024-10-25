package Java.DemoTuan6.Bai3;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TKTK extends TaiKhoan {
    private double TienTK; // Số tiền trong tài khoản tiết kiệm
    private double LaiSuat; // Lãi suất
    private LocalDate Ngaynap; // Ngày nạp tiền
    private Scanner sc; // Scanner để nhập dữ liệu

    public TKTK(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau, double LaiSuat,double TienTK, LocalDate Ngaynap) {
        super(soTaiKhoan, chuTaiKhoan, soDu, matKhau);
        this.TienTK = TienTK;
        this.LaiSuat = LaiSuat;
        this.Ngaynap = Ngaynap;
        this.sc = new Scanner(System.in); // Khởi tạo Scanner
    }

    public double getTienTK() {
        return TienTK;
    }

    public void setTienTK(double TienTK) {
        this.TienTK = TienTK;
    }

    public double getLaiSuat() {
        return LaiSuat;
    }

    public void setLaiSuat(double LaiSuat) {
        this.LaiSuat = LaiSuat;
    }

    public LocalDate getNgaynap() {
        return Ngaynap;
    }

    public void setNgaynap(LocalDate Ngaynap) {
        this.Ngaynap = Ngaynap;
    }

    public void napTien() {
        System.out.printf("Nhap so tien muon nap: ");
        double soTien = Double.parseDouble(sc.nextLine());

        if (soTien > 0) {
            TienTK += soTien;
            setSoDu(getSoDu() - soTien); // Cập nhật số dư trong tài khoản cơ bản
            System.out.println("Nap tien thanh cong! So tien trong tai khoan tiet kiem: " + TienTK);
        } else {
            System.out.println("So tien khong hop le!");
        }
    }

    public void rutTien() {
        System.out.printf("Nhap so tien muon rut: ");
        double soTien = Double.parseDouble(sc.nextLine());

        if (soTien > 0 && soTien <= TienTK) {
            TienTK -= soTien;
            setSoDu(getSoDu() + soTien); // Cập nhật số dư trong tài khoản cơ bản
            System.out.println("Rut tien thanh cong! So tien con trong tai khoan tiet kiem: " + TienTK);
        } else {
            System.out.println("So tien du khong du de thuc hien giao dich!");
        }
    }

    public void tinhLai() {
        long soNgay = ChronoUnit.DAYS.between(Ngaynap, LocalDate.now());
        for(int i=1 ; i <= (soNgay/365) ; i++){
            double lai = TienTK * (LaiSuat / 100.0); 
            TienTK = TienTK + lai;
        }
    }
}
