/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author baphuoc
 */
public class Quanly_Laptop {

    ArrayList<Laptop> listLT = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        System.out.println("1. Nhap ");
        System.out.println("2. Xuat ");
        System.out.println("0. thoat ");
        System.out.print("Nhap lua chon: ");
        int luachon = Integer.parseInt(sc.nextLine());
        switch(luachon){
            case 1: nhaptt();
            break;
            case 2: xuattt();
            break;
            case 0: System.exit(0);
            break;
            default:System.out.println("Lua chon ko tuong ung");
        }
    }

    public void nhaptt() {
        while(true){
        System.out.print("Nhập hãng sản xuất: ");
        String hangsx = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namsx = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kích cỡ: ");
        double kichco = Double.parseDouble(sc.nextLine());

//        Laptop lt = new Laptop(hangsx, namsx, kichco); //ko tham số
//        Laptop lt = new Laptop(); //Có tham số
//        lt.setHangSX(hangsx);
//        lt.setNamSx(namsx);
//        lt.setKichco(kichco);
//        listLT.add(lt);
        listLT.add(new Laptop(hangsx, namsx, kichco)); //dòng quan trọng
        
        System.out.print("Nhập tiếp hay thôi (Y/N)?");
        String tiep = sc.nextLine();
        if(tiep.equalsIgnoreCase("n")){
            break;
        }
        }
    }

    public void xuattt() {
        for (Laptop laptop : listLT) {
            System.out.println(laptop.toString());
        }
    }
}
