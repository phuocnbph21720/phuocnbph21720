/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014;

import java.util.Scanner;

/**
 *
 * @author baphuoc
 */
public class bai14 {
    String ten;
    double diem;
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập số điểm: ");
        this.diem = Double.parseDouble(sc.nextLine());
    }
    public void xuatTT(){
        System.out.println("Tên: "+this.ten);
        System.out.println("Điểm: "+this.diem);
    }
    public String xeploai(int diem){
        
        System.out.print("Xếp loại: ");
        if(this.diem<5){
            System.out.println("Trung bình");
        }else if(this.diem<8){
        System.out.println("Khá");
        }else if(this.diem<10){
            System.out.println("Giỏi");
        }
    }
}
