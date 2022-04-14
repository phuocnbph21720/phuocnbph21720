/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014.BaiTap.BieuThucChinhQui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author baphuoc
 */
public class QLsinhvien {
    ArrayList<Sinhvien> listsv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
     while(true){
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();
        
        String reEmail = "\\w+@\\w+\\.\\w{0,}";
        String email;
        while(true){
            System.out.print("Nhập email: ");
            email = sc.nextLine();
            if(email.matches(reEmail)){
                break;
            }else{
                System.out.println("Email không đúng định dạng!!!");
            }
        }
        
        String rePhone = "0\\d{9,10}";
        String phone;
         while(true){
            System.out.print("Nhập số điện thoại: ");
            phone = sc.nextLine();
            if(phone.matches(rePhone)){
                break;
            }else{
                System.out.println("Số điện thoại không đúng định dạng!!!");
            }
        }
         
         String reCmnd = "\\d{12}";
         String cmnd;
         while(true){
            System.out.print("Nhập số CCCD/CMND: ");
            cmnd = sc.nextLine();
            if(cmnd.matches(reCmnd)){
                break;
            }else{
                System.out.println("Số CCCD/CMND không đúng định dạng!!!");
            }
        }
         listsv.add(new Sinhvien(ten, email, phone, cmnd));
        System.out.print("Bạn muốn nhập tiếp hay ko(Y/N)?: ");
        String tiep = sc.nextLine();
        if(tiep.equalsIgnoreCase("n")){
            break;
        }
        
    }
   }
    
    public void xuat(){
        for (Sinhvien sinhvien : listsv) {
            System.out.println(sinhvien);
        }
    }
}
