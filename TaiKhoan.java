package Java.DemoTuan6.Bai3;

import java.util.Scanner;

public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;
    private Scanner sc; // Khai báo Scanner ở cấp độ lớp

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
        this.sc = new Scanner(System.in); // Khởi tạo Scanner
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan; 
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) { 
        this.soDu = soDu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) { 
        this.matKhau = matKhau;
    }

    public void napTien() {
        System.out.printf("Nhap so tien muon nap: ");
        double soTien = Double.parseDouble(sc.nextLine()); 

        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nap tien thanh cong! So tien moi: " + soDu);
        } else {
            System.out.println("So tien khong hop le!");
        }
    }

    public void rutTien() {
        System.out.printf("Nhap so tien muon rut: ");
        double soTien = Double.parseDouble(sc.nextLine()); 

        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Ryt tien thanh cong! So tien con: " + soDu);
        } else {
            System.out.println("So tien du khong du de thuc hien giao dich!");
        }
    }

    public void hienThiThongTin() {
        System.out.printf("So tai khoan: " + soTaiKhoan);
        System.out.printf("\nTen chu tai khoan: " + chuTaiKhoan);
    }

    public void doiMatKhau() {
        System.out.printf("Nhap lai mat khau cu: ");
        String mkc = sc.nextLine();

        if (mkc.equals(matKhau)) {
            System.out.printf("Nhap mat khau moi: ");
            String mkm = sc.nextLine();
            matKhau = mkm;
            System.out.println("Đoi mat khau thanh cong!");
        } else {
            System.out.println("Mat khau cu khong dung, vui long nhap lai!");
        }
    }

    public void dangNhap() {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.printf("Nhap so tai khoan: ");
            String nhapMa = sc.nextLine();

            System.out.printf("Nhap mat khau: ");
            String nhapMK = sc.nextLine();

            if (nhapMa.equals(soTaiKhoan) && nhapMK.equals(matKhau)) {
                System.out.println("Đang nhap thanh cong!");
                isLoggedIn = true;
            } else {
                System.out.println("Mat khau hoac so tai khoan khong dung! Moi nhap lai.");
            }
        }
    }
}
