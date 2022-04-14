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
public class virus {
    public String ten;
    private String mausac;
    private double kichthuoc;
    
    public virus(){
    }
    public virus(String ten, String mausac, double kichthuoc){
        this.mausac = mausac;
        this.ten = ten;
        this.kichthuoc = kichthuoc;
    }
    public virus(String ten,String mausac){
        this.mausac = mausac;
        this.ten = ten;
    }
    
    //get-set
    public String getMausac() {
        return mausac;
    }
    public void setmausac(String mausac){
        this.mausac = mausac;
    }
    
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten = ten;
    }
        
    public void getkichthuoc(double kichthuoc){
        if(kichthuoc <=0){
            System.out.println("Kích thước phải lớn hơn 0");
        }else{
            this.kichthuoc = kichthuoc;
        }
    }

    public void nhaptt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên virus: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        this.mausac = sc.nextLine();
        System.out.print("Nhập kích thước: ");
        this.kichthuoc = Integer.parseInt(sc.nextLine());
       
    }

    @Override
    public String toString() {
        return "virus{" + "Tên Virus = " + ten + ", Màu sắc = " + mausac + ", Kích thước = " + kichthuoc + '}';
    }
   
    
    
}
