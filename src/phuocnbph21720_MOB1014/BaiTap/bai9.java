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
public class bai9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while (true) menu();
    }
    public static void menu(){
        System.out.println("4.Bài 4");
        System.out.println("5.Bài 5");
        System.out.println("6.Bài 6");
        System.out.println("0.Thoát");
        System.out.print("Nhập vào lựa chọn: ");
         int _luachon = Integer.parseInt(sc.nextLine());
        switch (_luachon){
            case 4: bai4();
                break;
            case 5: bai5();
                break;
            case 6: bai6();
                break;
            case 7: System.exit(0);
        }
    }
    public static void bai4(){
        System.out.print("Nhập vòng 1 của suger baby 1: ");
                int _sg1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vòng 1 của suger baby 2: ");
                int _sg2 = Integer.parseInt(sc.nextLine()); 
        System.out.println("Vòng 1 lớn nhất là: " + Math.max(_sg1, _sg2)); 
              double AVG = (_sg1 + _sg2) / 2;
        System.out.printf("Trung bình cộng của 2 suger baby là: %.0f\n",AVG);
    }
    public static void bai5(){
        System.out.print("Nhập số đo vòng 1 nyc: ");
            int _vong1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số đo vòng 2 nyc: ");
            int _vong2 = Integer.parseInt(sc.nextLine()); 
        System.out.print("Nhập số đo vòng 3 nyc: ");
            int _vong3 = Integer.parseInt(sc.nextLine());      
        double _TBC =  ((double)((_vong1*3)+(_vong3*2)+_vong2)) / 6;
        System.out.println((double) Math.round(_TBC));        
    }
    public static void bai6(){
        System.out.print("Nhập tên: ");
            String _ten = sc.nextLine();
        System.out.print("Nhập tình trạng: ");
            String _tinhtrang = sc.nextLine();
        System.out.print("Nhập nhiệt độ: ");
            double _nhietdo = Double.parseDouble(sc.nextLine());
        String KL = (_nhietdo >= 38 ) ? "Khám nhanh covid giờ" : "Khoẻ như trâu, covid cũng sợ";

        System.out.println("Tên: "+_ten);
        System.out.println("Nhiệt độ: "+_nhietdo);
        System.out.println("Tình trạng: "+_tinhtrang);
        System.out.println("Kết luận: " + KL);
    }
}
