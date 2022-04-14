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
public class bai15 {
    String tenhang;
    int version;
    int gia;
    public bai15(){
        
    }
    public bai15(String tenhang,int version,int gia){
        this.tenhang = tenhang;
        this.version = version;
        this.gia = gia;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Hãng xe: ");
        this.tenhang = sc.nextLine();
        System.out.print("version: ");
        this.version = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá tiền: ");
        this.gia = Integer.parseInt(sc.nextLine());
    }
    public void xuatTT(){
        System.out.println("Hãng: "+this.tenhang);
        System.out.println("versoin: "+this.version);
        System.out.println("Giá tiền: "+this.gia);
    }
    public void xeploai(){
        System.out.print("Version: ");
        if(this.version<2018){
            System.out.println("Cũ");
        }else{
            System.out.println("Mới");
        }
    }
}
