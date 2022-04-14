/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author baphuoc
 */
public class Truongphong extends NhanVien{
    double luongtrachnhiem;

    public Truongphong() {
    }
    
    public Truongphong( String manv, String hoten, double luong,double luongtrachnhiem) {
        super(manv, hoten, luong);
        this.luongtrachnhiem = luongtrachnhiem;
    }

    public double getLuongtrachnhiem() {
        return luongtrachnhiem;
    }

    public void setLuongtrachnhiem(double luongtrachnhiem) {
        this.luongtrachnhiem = luongtrachnhiem;
    }
   
    @Override
    public double getthunhap(){
       return super.getLuong() + luongtrachnhiem;
    }
    
    public void xuat(){
        System.out.println("\n=====TRƯỞNG=PHÒNG=====");
        super.xuat();
        System.out.println("  Lương trách nghiệm: "+ luongtrachnhiem);
    }
}
