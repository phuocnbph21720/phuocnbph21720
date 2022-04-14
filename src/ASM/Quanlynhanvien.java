/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author baphuoc
 */
public class Quanlynhanvien {

    ArrayList<NhanVien> listNhanvien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
//    static int chucvu = 0;

    public boolean kiemtrid(String id) {
        boolean kiemtra = false;
        for (NhanVien nhanVien : listNhanvien) {
            if (nhanVien.getManv().equals(id)) {
                kiemtra = true;
            }
        }
        return kiemtra;
    }

    public void menu() {
        listNhanvien.add(new Truongphong("nv1", "DNguyễn Bá Phước", 50000000, 10000000));
        listNhanvien.add(new NhanvienTiepThi("nv2", "ATiếp thị 1", 14000000, 10000, 0.5));
        listNhanvien.add(new NhanvienTiepThi("nv3", "CTiếp thị 2", 10000000, 20000, 0.5));
        listNhanvien.add(new NhanVien("nv4", "BHành chính 1", 6000000));
        listNhanvien.add(new NhanVien("nv5", "EHành chính 2", 7000000));
        listNhanvien.add(new NhanVien("nv6", "Hành chính 3", 9000000));
        System.out.println("===============================================================");
        System.out.println("1.Nhập");
        System.out.println("2.xuất");
        System.out.println("3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
        System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
        System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
        System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
        System.out.println("0.Đăng xuất");
        System.out.println("===============================================================");
        System.out.print("Mời nhập lựa chọn: ");
        int luachon = Integer.parseInt(sc.nextLine());
        switch (luachon) {
            case 1:
                nhapTT();
                break;
            case 2:
                xuatTT();
                break;
            case 3:
                timma();
                break;
            case 4:
                xoama();
                break;
            case 5:
                capnhat();
                break;
            case 6:
                timluong();
                break;
            case 7:
                sxten();
                break;
            case 8:
                sxthunhap();
                break;
            case 9:
                top5();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn không tương ứng");
                break;
        }
    }

    public void nhapTT() {
        while (true) {
            System.out.print("Nhập mã nhân viên: ");
            String manv = sc.nextLine();
            try {
                if (kiemtrid(manv) == true) {
                    System.out.println("Mã Nhân viên đã tồn tại!!!");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Lỗi nhập mã nhân viên!!!");
            }
            System.out.print("Nhập họ tên: ");
            String hoten = sc.nextLine();
            double luong;
            while (true) {
                try {
                    System.out.print("Nhập lương: ");
                    luong = Double.parseDouble(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lương phải là số thực!!!");
                }
            }

            System.out.println("=====Chọn=Loại=Nhân=Viên=====");
            System.out.println("1.Trưởng phòng");
            System.out.println("2.Nhập viên tiếp thị");
            System.out.println("3.Nhân viên hành chính");
            System.out.print("Mời lựa chọn: ");
            int chonNV = Integer.parseInt(sc.nextLine());
            switch (chonNV) {
                case 1:
//                    chucvu = 1;
                    System.out.println("======TRƯỞNG=PHÒNG=====");
                    double luongtrachnghiem;
                    while (true) {
                        try {
                            System.out.print("nhập lương trách nghiệm: ");
                            luongtrachnghiem = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Lương trách nghiệm phải là số thực!!!");
                        }

                    }
                    listNhanvien.add(new Truongphong(manv, hoten, luong, luongtrachnghiem));
                    break;
                case 2:
//                    chucvu = 2;
                    System.out.println("=====TIẾP=THỊ=====");
                    double doanhso;
                    while (true) {
                        try {
                            System.out.print("Nhập doanh số: ");
                            doanhso = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Doanh số phải là số thực!!!");
                        }
                    }
                    double huehong;
                    while (true) {
                        try {
                            System.out.print("Nhập tỉ lệ huệ hồng: ");
                            huehong = Double.parseDouble(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Tỉ lệ huệ hông phải là số thực!!!");
                        }
                    }
                    listNhanvien.add(new NhanvienTiepThi(manv, hoten, luong, doanhso, huehong));
                    break;
                case 3:
                    listNhanvien.add(new NhanVien(manv, hoten, luong));
                    break;
                default:
                    System.out.println("Lựa chọn không tương ứng!!!");
                    break;
            }
            System.out.print("Nhập tiếp hay thôi(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatTT() {
        for (NhanVien nhanVien : listNhanvien) {
            nhanVien.xuat();
        }
    }

    public void timma() {
        System.out.println("\nTÌM VÀ HIỂN THỊ NHÂN VIÊN THEO MÃ NHÂN VIÊN");
        int index = 0;
        boolean check = false;
        System.out.print("Nhập mã nhân viên: ");
        String manv = sc.nextLine();
        for (int i = 0; i < listNhanvien.size(); i++) {
            if (listNhanvien.get(i).getManv().equalsIgnoreCase(manv)) {
                index = i;
                check = true;
            }
        }
        if (check == true) {
            listNhanvien.get(index).xuat();
        } else {
            System.out.println("Mã Nhân viên không tồn tại!!!");
        }

    }

    public void xoama() {
        System.out.println("\nXÓA NHÂN VIÊN THEO MÃ NHÂN VIÊN");
        int index = 0;
        boolean check = false;
        System.out.print("Nhập mã nhân viên: ");
        String manv = sc.nextLine();
        for (int i = 0; i < listNhanvien.size(); i++) {
            if (listNhanvien.get(i).getManv().equalsIgnoreCase(manv)) {
                index = i;
                check = true;
            }
        }
        if (check == true) {
            System.out.println("Đã xóa nhân viên có mã: " + listNhanvien.get(index).getManv());
            listNhanvien.remove(index);
        } else {
            System.out.println("Mã Nhân viên không tồn tại!!!");
        }
    }

    public void capnhat() {
        System.out.println("CẬP NHẬT NHÂN VIÊN THEO MÃ NHẬP TỪ BÀN PHÍM");
        int index = 0;
        boolean check = false;
        System.out.print("Nhập mã nhân viên: ");
        String manv = sc.nextLine();
        for (int i = 0; i < listNhanvien.size(); i++) {
            if (listNhanvien.get(i).getManv().equalsIgnoreCase(manv)) {
                index = i;
                check = true;
            }
        }
        if (check == true) {
//            while(true){
            System.out.println("1.Họ và tên");
            System.out.println("2.Lương");
            System.out.println("3.Lương trách nhiệm(Trưởng phòng)");
            System.out.println("4.Doanh số và tỉ lệ hoa hồng(Tiếp thị)");
            System.out.println("0.Thoát cập nhật");
            System.out.print("Mời lựa chọn thông tin cập nhật: ");
            int thongtin = Integer.parseInt(sc.nextLine());
            switch (thongtin) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String hoten = sc.nextLine();
                    listNhanvien.get(index).setHoten(hoten);
                    break;
                //lương trách nhiệm
                case 2:
                    System.out.print("Nhập lương");
                    Double luong = Double.parseDouble(sc.nextLine());
                    listNhanvien.get(index).setLuong(0);
                    break;
                case 3:
                    if(listNhanvien.get(index) instanceof Truongphong){
                        System.out.print("Nhập lương trách nhiệm: ");
                        double luongTN = Double.parseDouble(sc.nextLine());
                        listNhanvien.add(new Truongphong(listNhanvien.get(index).getManv(), listNhanvien.get(index).getHoten(), listNhanvien.get(index).getLuong(), luongTN));
                        listNhanvien.remove(index);
                    }else{
                        System.out.println(listNhanvien.get(index).getManv()  +" Không phải trưởng phòng");
                    }
                    break;
                case 4: 
                    if(listNhanvien.get(index) instanceof NhanvienTiepThi){
                        System.out.print("Nhập doanh số: ");
                        double doanhso = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập huệ hồng: ");
                        double huehong = Double.parseDouble(sc.nextLine());
                        listNhanvien.add(new NhanvienTiepThi(listNhanvien.get(index).getManv(), listNhanvien.get(index).getHoten(), listNhanvien.get(index).getLuong(), doanhso, huehong));
                        listNhanvien.remove(index);
                    }else{
                        System.out.println(listNhanvien.get(index).getManv()  +" Không phải nhân viên tiếp thị");
                    }
                case 0:
//                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không tương ứng!!!");
                    break;
            }
//            }
        } else {
            System.out.println("Mã Nhân viên không tồn tại!!!");
        }
    }

    public void timluong() {
        System.out.println("TÌM NHÂN VIÊN THEO KHOẢNG LƯƠNG NHẬP");
        System.out.print("Từ: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print(" đến: ");
        double max = Double.parseDouble(sc.nextLine());
        for (NhanVien nhanVien : listNhanvien) {
            if (nhanVien.getLuong() >= min && nhanVien.getLuong() <= max) {
                nhanVien.xuat();
            }
        }
    }

    public void sxthunhap() {
        System.out.println("SẮP XẾP NHÂN VIÊN THEO THU NHẬP");
        Collections.sort(listNhanvien, ((o1, o2) -> Double.compare(o2.getthunhap(), o1.getthunhap())));
        xuatTT();
    }

    public void sxten() {
        System.out.println("SẮP XẾP NHÂN VIÊN THEO HỌ VÀ TÊN");
        Collections.sort(listNhanvien, (t1, t2) -> t1.getHoten().compareTo(t2.getHoten()));
        xuatTT();
    }

    public void top5() {
        Collections.sort(listNhanvien, ((o1, o2) -> Double.compare(o2.getthunhap(), o1.getthunhap())));
        for (int i = 0; i < 5; i++) {
            listNhanvien.get(i).xuat();
        }
    }
}
