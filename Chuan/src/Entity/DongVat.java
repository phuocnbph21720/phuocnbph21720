/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author minhdq
 */
public class DongVat {
    String ten;
    int soChan;
    String mauSac;

    public DongVat() {
    }

    public DongVat(String ten, int soChan, String mauSac) {
        this.ten = ten;
        this.soChan = soChan;
        this.mauSac = mauSac;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "DongVat{" + "ten=" + ten + ", soChan=" + soChan + ", mauSac=" + mauSac + '}';
    }
    
}
