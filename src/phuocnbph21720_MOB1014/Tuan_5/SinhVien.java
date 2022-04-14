/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.Tuan_5;

import java.util.Comparator;

/**
 *
 * @author baphuoc
 */
public class SinhVien {
    public String ten;
    private double diem;
    String masv;
    private String lop;

    public SinhVien(String ten, double diem, String masv, String lop) {
        this.ten = ten;
        this.diem = diem;
        this.masv = masv;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public static Comparator<SinhVien> StuNameComparator = new Comparator<SinhVien>() {

	public int compare(SinhVien s1, SinhVien s2) {
	   String StudentName1 = s1.getTen().toUpperCase();
	   String StudentName2 = s2.getTen().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", diem=" + diem + ", masv=" + masv + ", lop=" + lop + '}';
    }
    
}
