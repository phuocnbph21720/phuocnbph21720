/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.Tuan_5;

/**
 *
 * @author baphuoc
 */
public class Nhanvien {
    public String hoten;
    private double luong;

    public Nhanvien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
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

    public void xuat() {
        System.out.println("Họ tên: "+ hoten);
        System.out.println("Lương: "+ luong);
    }

    
    
}
