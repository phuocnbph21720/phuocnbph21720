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
public class Bai_8 {
    static Scanner sc = new Scanner(System.in);
    static String _ten;
    static int _tuoi;
    static int _vong1;
    public static void main(String[] args){
        while (true) menu();
    }
    public static void menu(){
    System.out.println("1. Nhập thông tin");
    System.out.println("2. Xuất thông tin");
    System.out.println("3. Đăng xuất");
    System.out.print("Nhập lựa chọn: ");
        int _luachon = Integer.parseInt(sc.nextLine());
    switch (_luachon){
        case 1: nhapTT();
            break;
        case 2: xuatTT();
            break;
        case 3: System.exit(0);
    }
    }
    public static void nhapTT(){
        System.out.println(">>>>>>Thông tin NYC<<<<<<");
        System.out.print("Nhập tên NYC: ");
            _ten = sc.nextLine();
        System.out.print("Nhập Tuổi NYC: ");
            _tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vòng 1 NYC: ");
            _vong1 = Integer.parseInt(sc.nextLine()); 
           
    }
    public static void xuatTT(){
        System.out.println(">>>>>>Thông tin NYC<<<<<<");
        System.out.println("Tên NYC: "+ _ten);
        System.out.println("Tuổi NYC: "+ _tuoi);
        System.out.println("Số đo vòng 1: "+ _vong1);
    }
}
