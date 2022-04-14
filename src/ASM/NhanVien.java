/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author baphuoc
 */
public class NhanVien {
    public String manv;
    private String hoten;
    private double luong;

    public NhanVien() {
    }

    
    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    //getthunhap && thuế
    public double getthunhap(){
        return luong;
    }
    public double getthueTN(){
        if(getthunhap()<9000000){
            return 0;
        }else if(getthunhap() < 15000000){
            return getthunhap() * (0.1);
        }else{
            return getthunhap() * (0.12);
        }
    }
    
    public void xuat(){
        System.out.println("\n  Mã Nhân Viên: "+ manv );
        System.out.println("  Họ Tên: "+ hoten);
        System.out.println("  Lương: "+ luong);
        System.out.println("  Thu nhập: "+getthunhap());
        System.out.println("  Thuế: " + getthueTN());
    }
    
    
    
}
