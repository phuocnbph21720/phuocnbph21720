/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuocnbph21720_MOB1014;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author baphuoc
 */
public class bai_11 {
    static Scanner sc = new Scanner(System.in);
    static int _vong1, _vong3;
    public static void main(String[] args){
        while(true) menu();
    }
    public static void menu(){
        System.out.println("1. Nhập thông tin: ");
        System.out.println("2. Hiệu và Tích 2 số đo");
        System.out.println("3.Tổng của hiệu + tích 2 số đo");
        System.out.println("4.Tổng 2 mũ của 2 số đo");
        System.out.println("5.Nhận định vòng 1");
        System.out.println("0.EXIT");
        System.out.print("Nhập vào lựa chọn: ");
            int _luachon = Integer.parseInt(sc.nextLine());
        switch(_luachon){
            case 1: nhapTT();
                break;
            case 2: {
                System.out.println("Hiệu của 2 số đo là: "+hieu(_vong1,_vong3));
                System.out.println("Tích 2 số đo là: "+tich(_vong1,_vong3));
            }
                break;
            case 3:
                System.out.println("Tổng của hiệu và tích 2 số đo là: "+(hieu(_vong1,_vong3)+tich(_vong1,_vong3)));
                break;
            case 4: tongmu2(_vong1,_vong3);
                break;
            case 5: check(_vong1);
                break;
            case 0: System.exit(0);
               
        }
    }
    public static void nhapTT(){
        System.out.print("Nhập số đo vòng 1: ");
            _vong1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số đo vòng 3: ");
            _vong3 = Integer.parseInt(sc.nextLine());
    }
    public static int hieu(int a, int b){
        return a-b;
    }
    public static int tich(int a, int b){
        return a*b;
    }
    public static void tong(int a, int b){
        System.out.println("tổng của hiệu và tích của vòng 1, vòng 3 là: "+ (a+b));
    }
    public static void tongmu2(int a, int b){
       int tong = (int) (pow(a,2) + pow(b,2));
       System.out.println("Tổng 2 mũ của 2 số đo là: " + tong);
    }
    public static void check(int a){
        String check = (a>=90) ? "Vòng 1 đạt chuẩn" : "Vòng 1 chưa chuẩn";
        System.out.println("Nhận định vòng 1: "+check);
    }
    
    
}
