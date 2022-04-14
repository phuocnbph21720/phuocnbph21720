/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entity.DongVat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class DongVatService {
 
    public DongVat inputDongVat() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
            System.out.print("Nhập số chân: ");
            int soChan = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập màu: ");
            String mauSac = sc.nextLine();
            
            DongVat dv = new DongVat(ten, soChan, mauSac);
            
            return dv;
    }
    public DongVat searchDongVat(ArrayList<DongVat> listDongVat, String name) {
        DongVat dongVatFind = null;
        for (DongVat dongVat : listDongVat) {
            if (dongVat.getTen().equalsIgnoreCase(name)) {
                dongVatFind = dongVat;
            }
        }
        return dongVatFind;
    }
    public void sortDongVat(ArrayList<DongVat> listDongVat) {
        listDongVat.sort((DongVat s1, DongVat s2) -> s1.getTen().compareTo(s2.getTen()));
    }
    public void sortDongVat2(ArrayList<DongVat> listDongVat) {
        listDongVat.sort((DongVat s1, DongVat s2) -> Integer.compare(s1.getSoChan(), s2.getSoChan()));
    }
}
