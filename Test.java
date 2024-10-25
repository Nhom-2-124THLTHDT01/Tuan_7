package Java.DemoTuan6.Bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk = new TaiKhoan("123456789", "Nguyen van A", 1000000, "12345");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayNap = LocalDate.parse("30/01/2022", formatter);

        TKTK tktk = new TKTK("123456789", "Nguyen van A", 1000000, "12345", 20, 5000000, ngayNap);
        
        TKTT tktt = new TKTT("123456789", "Nguyen van A", 1000000, "12345", 2000000, 250000, 320000);
        tk.dangNhap(); 
        boolean exit = false;
        while (exit == false) {
                System.out.println("\n---THONG TIN DANG NHAP---");
                tk.hienThiThongTin();
                System.out.println("\n---MENU LUA CHON---");
                System.out.println("1.Kiem tra so du trong tai khoan");
                System.out.println("2.Nap tien");
                System.out.println("3.Rut tien");
                System.out.println("4.Doi mat khau");
                System.out.println("5.Tai khoan tiet kiem");
                System.out.println("6.Tai khoan thanh toan");
                System.out.println("7.Thoat");
                System.out.printf("Nhap lua chon cua ban: ");

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                        case 1:
                                System.out.println("So du hien tai: " + tk.getSoDu());
                                break;
                        case 2:
                                tk.napTien();
                                break;
                        case 3:
                                tk.rutTien();
                                break;
                        case 4:
                                tk.doiMatKhau();
                                break;
                        case 5:
                                int thaydoi = 0;
                                boolean exitTK = false;
                                while (exitTK == false) {
                                        System.out.println("\n---THONG TIN TAI KHOAN TIET KIEM---");
                                        tk.hienThiThongTin();
                                        System.out.printf("\nNgay nap tien: " + tktk.getNgaynap());
                                        System.out.println("\n---MENU LUA CHON---");
                                        System.out.println("1.Kiem tra so du trong tai khoan");
                                        System.out.println("2.Nap tien");
                                        System.out.println("3.Rut tien");
                                        System.out.println("4.Thoat");
                                        System.out.printf("Nhap lua chon cua ban: ");

                                        int choice2 = Integer.parseInt(sc.nextLine());

                                        switch (choice2) {
                                                case 1:
                                                        if (thaydoi == 0) {
                                                                tktk.tinhLai();
                                                        }
                                                        System.out.printf("So tien tiet kiem hien tai: "+ tktk.getTienTK());
                                                        System.out.println("\nLai suat hang nam: " + tktk.getLaiSuat()+"%");
                                                        break;
                                                case 2:
                                                        tktk.napTien();
                                                        thaydoi = 1;
                                                        break;
                                                case 3:
                                                        tktk.rutTien();
                                                        thaydoi = 1;
                                                        break;
                                                case 4:
                                                        exitTK = true;
                                                        break;
                                                default:
                                                        System.out.println("Lua chon khong hop le! Vui long chon lai.");
                                                        break;
                                        }
                                }
                                break;
                        case 6:
                                boolean exitTT = false;
                                while (exitTT == false) {
                                        System.out.println("\n---THONG TIN TAI KHOAN THANH TOAN---");
                                        tk.hienThiThongTin();
                                        System.out.println("\n---MENU LUA CHON---");
                                        System.out.println("1.Kiem tra so du trong tai khoan");
                                        System.out.println("2.Nap tien");
                                        System.out.println("3.Rut tien");
                                        System.out.println("4.Thanh toan tien dien");
                                        System.out.println("5.Thanh toan tien nuoc");
                                        System.out.println("6.Thoat");
                                        System.out.printf("Nhap lua chon cua ban: ");

                                        int choice3 = Integer.parseInt(sc.nextLine());

                                        switch (choice3) {
                                                case 1:
                                                        System.out.printf("So tien hien tai trong tai khoan: "+ tktt.getsoDuTT());
                                                        break;
                                                case 2:
                                                        tktt.napTien();
                                                        break;
                                                case 3:
                                                        tktt.rutTien();
                                                        break;
                                                case 4:
                                                        tktt.ThanhToanTD();
                                                        break;
                                                case 5: 
                                                        tktt.ThanhToanTN();
                                                        break;
                                                case 6:
                                                        exitTT = true;
                                                        break;
                                                default:
                                                        System.out.println("Lua chon khong hop le! Vui long chon lai.");
                                                        break;
                                        }
                                }
                                break;
                        case 7:
                                exit = true;
                                System.out.println("Cam on Quy khach da su dung dich vu.");
                                break;
                        default:
                                System.out.println("Lua chon khong hop le! Vui long chon lai.");
                                break;
                }
        }
        sc.close();
    }
}

