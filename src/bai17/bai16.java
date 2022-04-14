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
public class bai16 {
    private double chieudai;
    private double chieurong;
//    double chuvi = chuvi(chieudai,chieurong);
    
    public bai16(){
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        if(chieudai < 0){
            System.out.println("Chiều dài phải > 0");
        }else{
            this.chieudai = chieudai;
        }
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        if(chieurong < 0){
            System.out.println("Chiều rộng phải > 0");
        }else{
            this.chieurong = chieurong;
        }
    }
    
    public void nhaptt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.chieudai = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        this.chieurong = Double.parseDouble(sc.nextLine());
    }
    public double chuvi(double chieurong,double chieudai){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        return chieudai+chieurong;
    }
    public double dientich(double chieurong,double chieudai){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        return chieudai*chieurong;
    }

    @Override
    public String toString() {
        return "bai16{" + "chiều dài =" + chieudai + ", chiều rộng =" + chieurong + ", chu vi =" + chuvi(chieudai,chieurong) + ", Diện tích =" + dientich(chieurong, chieudai) +'}';
    }
    
}
