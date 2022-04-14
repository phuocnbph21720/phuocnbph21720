/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.Tuan_5;

/**
 *
 * @author baphuoc
 */
public class Nhanvien_main {
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien("Trịnh Văn Hiếu", 1000);
        nv.xuat();
        System.out.println(">>>>>Trưởng phòng<<<<<");
        TruongPhong tp = new TruongPhong(1.5, "Nguyễn Bá Phước", 10000);
        tp.xuat();
    }
}
