/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author baphuoc
 */
public class NhanvienTiepThi extends NhanVien{
    double doanhso;
    double huehong;

    public NhanvienTiepThi() {
    }
    
    
    public NhanvienTiepThi( String manv, String hoten, double luong,double doanhso, double huehong) {
        super(manv, hoten, luong);
        this.doanhso = doanhso;
        this.huehong = huehong;
    }

    public double getDoanhso() {
        return doanhso;
    }

    public void setDoanhso(double doanhso) {
        this.doanhso = doanhso;
    }

    public double getHuehong() {
        return huehong;
    }

    public void setHuehong(double huehong) {
        this.huehong = huehong;
    }

    @Override
    public double getthunhap() {
        return (super.getLuong() + (doanhso * huehong)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void xuat(){
        System.out.println("\n=====TIẾP=THỊ=====");
        super.xuat();
        System.out.println("  Doanh số: "+ doanhso);
        System.out.println("  Tỉ lệ huệ hồng: "+ huehong);
    }
    
    
}
