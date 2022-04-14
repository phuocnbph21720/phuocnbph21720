/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.Tuan_5;

import java.util.*;

/**
 *
 * @author baphuoc
 */
public class ThongTinSV {
    ArrayList<SinhVien> listSv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);        
    public boolean KiemtraID(String a){
        boolean kqKiemTra = false;
        for (int i = 0; i < listSv.size(); i++) {
          if(listSv.get(i).getMasv().equals(a)){
              kqKiemTra = true;
          }  
        }
        return kqKiemTra;
    }
    public void menu(){
        
        listSv.add(new SinhVien("a", 10, "01", "01"));
        listSv.add(new SinhVien("b", 3, "02", "01"));
        listSv.add(new SinhVien("c", 4, "03", "02"));
       
        listSv.add(new SinhVien("e", 5, "04", "01"));
         listSv.add(new SinhVien("d", 5, "03", "02"));
        listSv.add(new SinhVien("Phước", 10, "04", "01"));
        listSv.add(new SinhVien("a", 1, "02", "01"));
                
        System.out.println("1.NhapTT");
        System.out.println("2.XuatTT");
        System.out.println("3.Xuất DS SV theo bảng điểm :");
        System.out.println("4.Tìm SV theo tên :");
        System.out.println("5.Sửa điểm SV theo tên :");
        System.out.println("6.Xóa SV theo tên:");
        System.out.println("7.SX theo tên :");
        System.out.println("0.Kết thúc:");
        System.out.print(">>Mời chọn chức năng :");
        
        int luachon = Integer.parseInt(sc.nextLine());
        switch(luachon){
            case 1: nhaptt();
            break;
            case 2: xuatTT();
            break;
            case 3: xuattheoDiem();
            break;
            case 4: timtheoten();
            break;
            case 5: suatheoten();
            break;
            case 6: xoatheoTen();
            break;
            case 7: sxtheoten();
            break;
            case 0: System.exit(0);
            break;
            default:System.out.println("Lua chon khong tuong ung!!!!");
        }
    }
    public void xuatTT(){
//          System.out.println("");
//            listSv.forEach( x -> System.out.println(x));
//             System.out.println("=====================");  
            for (SinhVien sinhVien : listSv) {
                System.out.println(sinhVien);
        }
    }
    public void nhaptt(){
        System.out.println("Nhập danh sách sinh viên");
        while(true){
            //Nhập mã
            System.out.print("Nhập vào mã sinh viên: ");
            String maSV = sc.nextLine();
            try{
                if (KiemtraID(maSV) == true){
                    System.out.println("Mã SV đã tồn tại");
                    return;
                }
            }catch(Exception e){
                System.out.println("Loi nhap ma sinh vien");
            }
            //nhập họ tên
            System.out.print("Nhập họ và tên: ");
            String ten = sc.nextLine();
            //nhập lớp
            System.out.print("Nhập Lớp: ");
            String lop = sc.nextLine();
            //nhập điểm
            double diem;
            while(true){
                try{
                    System.out.print("Nhập điểm: ");
                    diem = Double.parseDouble(sc.nextLine());
                    break;
                }catch(Exception e){
                    System.out.println("Điểm phải là số !!!!");
                }
            }
            
            SinhVien sv = new SinhVien(ten, diem, maSV, lop);
            listSv.add(sv);
            System.out.print("Ban muon nhap tiep khong?(Y/N)");
            String YN = sc.nextLine();
            if(YN.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    public void xuattheoDiem(){
        System.out.println("Tím kiếm tên theo điểm");
        System.out.print("Điểm Min: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Max: ");
        double max = Double.parseDouble(sc.nextLine());
        for (SinhVien sv : listSv) {
            if(sv.getDiem() >= min && sv.getDiem() <= max ){
                System.out.println(sv.toString());
            }
        }
        System.out.println("=============================");
    }
    public void timtheoten(){
        System.out.println("TÌM KIẾM SINH VIÊN");
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();
        for (SinhVien sv : listSv) {
            if(sv.getTen().equalsIgnoreCase(name)){
                System.out.println(sv);
            }
        }
    }
    public void suatheoten(){
        System.out.println("SỬA ĐIỂM SINH VIÊN");
        int index = 0;
        System.out.print("Nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.print("Nhập số điểm: ");
        double diem = Double.parseDouble(sc.nextLine());
        for(int i = 0; i<listSv.size();i++){
            if(listSv.get(i).getTen().equalsIgnoreCase(name)){
                index = i;
            }
        }
        
        listSv.get(index).setDiem(diem);
        System.out.println(listSv.get(index));
    }
    public void xoatheoTen(){
//        int index = 0;
        System.out.println("XÓA SINH VIÊN THEO TÊN");
        System.out.print("Nhập tên sinh viên muốn xóa: ");
        String name = sc.nextLine();
        for(int i = 0; i<listSv.size();i++){
            if(listSv.get(i).getTen().equalsIgnoreCase(name)){
                listSv.remove(i);
            }
        }
        System.out.println("====Danh sách sv sau khi xóa====");
        for (SinhVien sinhVien : listSv) {
            System.out.println(sinhVien);
        }
    }
    public void sxtheoten(){
       Collections.sort(listSv, SinhVien.StuNameComparator);
        for (SinhVien sinhVien : listSv) {
            System.out.println(sinhVien);
        }
    }
    
}
