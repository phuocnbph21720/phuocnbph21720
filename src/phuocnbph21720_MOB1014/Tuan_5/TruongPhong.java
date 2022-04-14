/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.Tuan_5;

/**
 *
 * @author baphuoc
 */
public class TruongPhong extends Nhanvien{
    public double trachngiem;

    public TruongPhong(double trachngiem, String hoten, double luong) {
        super(hoten, luong);
        this.trachngiem = trachngiem;
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println(">> Trách nghiệm: " + trachngiem);
    }
}
