/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author baphuoc
 */
public class bonus3 {

    static Scanner sc = new Scanner(System.in);
    public String ten;
    private int tuoi;
    private int vong1;
    private int vong2;
    private int vong3;

    public bonus3() {

    }

    //get & 
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getVong1() {
        return vong1;
    }

    public void setVong1(int vong1) {
        if (vong1 < 0) {
            System.out.println("Vòng 1 phải > 0!!!");
        } else {
            this.vong1 = vong1;
        }
    }

    public int getVong2() {
        return vong2;
    }

    public void setVong2(int vong2) {
        if (vong2 < 0) {
            System.out.println("Vòng 2 phải > 0");
        } else {
            this.vong2 = vong2;
        }
    }

    public int getVong3() {
        return vong3;
    }

    public void setVong3(int vong3) {
        if (vong3 < 0) {
            System.out.println("Vòng 3 phải > 0");
        } else {
            this.vong3 = vong3;
        }
    }

    public void nhaptt() {
        System.out.print("Nhập tên nyc: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
                int t;
        do {
             t = Integer.parseInt(sc.nextLine());
            if (t< 0) {

                System.out.println("Tuổi phải > 0!!! xin moi nhap lai");
            }
        } while (t <= 0);
        this.setTuoi(t);
        System.out.print("Nhập số đo vòng 1: ");
        this.vong1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số đo vòng 2: ");
        this.vong2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số đo vòng 3: ");
        this.vong3 = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "bonus3{" + "Tên = " + this.ten + ", Tuổi=" + this.tuoi + ", Vòng 1 = " + this.vong1 + ", Vòng 2= " + this.vong2 + ", Vòng 3 = " + this.vong3 + '}';
    }

    public void menu() {
        System.out.println("1.Nhập thông tin nyc");
        System.out.println("2.Xuất thông tin nyc");
        System.out.println("0.Đăng xuất");
        System.out.print("Nhập lựa chọn: ");
        int luachon = Integer.parseInt(sc.nextLine());
        switch (luachon) {
            case 1:
                nhaptt();
                break;
            case 2:
                System.out.println("<<<<<-----Thông tin NYC----->>>>>\n" + toString());
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

}
