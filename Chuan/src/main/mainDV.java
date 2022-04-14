/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entity.DongVat;
import java.util.ArrayList;
import java.util.Scanner;
import service.DongVatService;

/**
 *
 * @author minhdq
 */
public class mainDV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DongVat> listDongVat = new ArrayList<>();
        DongVatService dvService = new DongVatService();
        do {
            System.out.println("1.Nhap danh sach thong tin");
            System.out.println("2.Xuat danh sach");
            System.out.println("3.Tim kiem");
            System.out.println("4.Sap xep");
            System.out.println("5.Xoa ");
            System.out.println("6.Thoat");
            System.out.print("Nhap chuc nang:");
            int function = Integer.parseInt(scanner.nextLine());
            switch (function) {
                case 1:
                    while (true) {
                        DongVat dv = dvService.inputDongVat();
                        listDongVat.add(dv);
                        System.out.print("Muon tiep tuc hay khong (Y/N):");
                        String tiep = scanner.nextLine();
                        if (tiep.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    listDongVat.forEach(s -> System.out.println(s.toString()));
                    break;
                case 3:
                    System.out.print("Nhap tên:");
                    String nameFind = scanner.nextLine();
                    DongVat dongVatFind = dvService.searchDongVat(listDongVat, nameFind);
                    if (dongVatFind != null) {
                        System.out.println("Da tim thay");
                        System.out.println(dongVatFind.toString());
                    } else {
                        System.out.println("Khong tim thay");
                    }
                case 4:
                    dvService.sortDongVat(listDongVat);
                    System.out.println("Sau khi sort");
                    listDongVat.forEach(s -> System.out.println(s.toString()));
                case 5:

                case 6:
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai . Vui long nhap lai");
                    break;
            }
        } while (true);

    }
}
