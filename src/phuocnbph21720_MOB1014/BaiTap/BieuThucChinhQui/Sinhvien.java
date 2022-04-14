/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.BaiTap.BieuThucChinhQui;

/**
 *
 * @author baphuoc
 */
public class Sinhvien {
     public String ten;
     String Email;
     String phone;
     String Cmnd;

    public Sinhvien(String ten, String Email, String phone, String Cmnd) {
        this.ten = ten;
        this.Email = Email;
        this.phone = phone;
        this.Cmnd = Cmnd;
    }

  

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getphone() {
        return phone;
    }

    public void setSdt(String Sdt) {
        this.phone = phone;
    }

    public String getCmnd() {
        return Cmnd;
    }

    public void setCmnd(String Cmnd) {
        this.Cmnd = Cmnd;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "ten=" + ten + ", Email=" + Email + ", Số điện thoại = " + phone + ", Cmnd=" + Cmnd + '}';
    }
    
}
