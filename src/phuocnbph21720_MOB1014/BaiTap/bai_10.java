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
public class bai_10 {
    static Scanner sc = new Scanner(System.in);
    static String _ten;
    static int _chieucao, _tuoi, _cannang;
    public static void main(String[] args){
        while(true) menu();
    }
    public static void nhapTT(){
        System.out.print("Nhập tên: ");
            _ten = sc.nextLine();
        System.out.print("Nhập số tuổi: ");
            _tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chiều cao: ");
           _chieucao = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập cân nặng: ");
            _cannang = Integer.parseInt(sc.nextLine());
    }
    public static void xuatTT(String a,int b,int c,int d){
        System.out.println("Tên: "+a);
        System.out.println("Tuổi: "+b);
        System.out.println("Cân Nặng: "+c);
        System.out.println("Chiều cao: "+d);
    }
    public static int tong(){
            return _cannang+_chieucao;
    }
    public static int tuoitho(int a,int b){
      return a+b;    
    }
    public static void menu(){
        System.out.println("1.Nhập thông tin");
        System.out.println("2.xuất thông tin");
        System.out.println("3.Tổng cân nặng + chiều cao");
        System.out.println("4.Tuổi thọ");
        System.out.println("0.thoát");
        System.out.print("Nhập lựa chọn: ");
            int _luachon = Integer.parseInt(sc.nextLine());
        switch(_luachon){
            case 1: nhapTT();
                break;
            case 2: xuatTT(_ten,_tuoi,_cannang,_chieucao);
                break;
            case 3: System.out.println("Tổng cân nặng + chiều cao: "+tong());
                break;
            case 4: System.out.println("Tuổi thọ: "+ tuoitho(_tuoi,_cannang));
                break;
            case 0: System.exit(0);
        }
    }
    
    
}
