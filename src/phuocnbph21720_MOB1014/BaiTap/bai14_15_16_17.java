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
public class bai14_15_16_17 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) menu();            
    }
    public static void menu(){
        System.out.println("\n1.bài 14");
        System.out.println("2.bài 15");
        System.out.println("3.bài 16");
        System.out.println("4.bài 17");
        System.out.println("0.EXIT");
        System.out.print("Nhập lựa chọn: ");
        int luachon = Integer.parseInt(sc.nextLine());
        switch(luachon){
            case 1: bai14();
                break;
            case 2: bai15();
                break;
            case 3: bai16();
                break;
            case 4: bai17();
                break;
            case 0: System.exit(0);
                break;
        }
    }
    public static void bai14(){
        int count = 0,sum=0;
        for (int i = 27; i < 999; i++) {
            if(i%5==0){
                count+=1;
                sum+=i;
            }     
        }
        System.out.println("trung bình cộng các số chia hết cho 5 từ 27 đến 999: "+((double)sum/count));
    }
    public static void bai15(){       
        System.out.print("Nhập số thành viên trong gia đình: ");
        int sl = Integer.parseInt(sc.nextLine());
        double[] cannang = new double[sl];
        for (int i = 0; i < cannang.length ; i++) {
            System.out.printf("Nhập cân nặng của thành viên thứ %d: ",i+1);
            cannang[i] = Double.parseDouble(sc.nextLine());
        }
        for (int i = 0; i < cannang.length ; i++) {
            if(cannang[i]>50){
                System.out.println("thành viên thứ "+(i+1)+":"+cannang[i]+" KG");
            }
        }
        for (int i = 0; i < cannang.length ; i++) {
            if(cannang[i]%2==0){
                System.out.println("thành viên thứ "+(i+1)+":"+cannang[i]+" KG");
            }
        }
        double max = cannang[0];
        for (int i = 0; i < cannang.length ; i++) {
            if(cannang[i] > max){
                max=cannang[i];
            }
        }
        System.out.println("cân nặng lớn nhất là: "+max+" KG");
        
    }
    public static void bai16(){
        System.out.print("Nhập số lượng thành viên trong gia đình: ");
        int SL = Integer.parseInt(sc.nextLine());
        String[] ten = new String[SL];
        int[] tuoi = new int[SL];
        for (int i = 0; i < SL; i++) {
            System.out.print("Nhập tên của thành viên thứ "+(i+1)+": ");
            ten[i] = sc.nextLine();
            System.out.print("Nhập số tuổi của thành viên thứ "+(i+1)+": ");
            tuoi[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < SL; i++) {
            System.out.println(ten[i]+": "+tuoi[i]+" tuổi");
        }
        int max = tuoi[0];
        for(int i=0;i<SL;i++){
            if(tuoi[i]>max){
                max=tuoi[i];
            }
        }
        for(int i=0;i<SL;i++){
            if(tuoi[i]==max){
                System.out.println("Thành viên có tuổi cao nhất: "+ten[i]+": "+tuoi[i]+" tuổi");
            }
        }
    }
    public static void bai17(){
        System.out.println("Nhập số lượng cho mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a["+(i+1)+"]: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        int min=a[0],max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("\nMax: "+max);
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                max=a[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.print("Các số chia hết cho 3 và 5: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0 && a[i]%5==0){
                System.out.print(a[i]+" ");
            }
        }
        int j,temp;
        for (int i = 0; i < ( size - 1 ); i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (a[j] < a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("\nSắp xếp theo thứ tự giảm dần: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
