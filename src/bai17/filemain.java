/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai17;

/**
 *
 * @author baphuoc
 */
public class filemain {
    public static void main(String[] args) {
        virus co_vit = new virus();
        co_vit.nhaptt();
        System.out.println("!!!!!!!--CO-VID--!!!!!!!\n"+co_vit);
        
        virus hiv = new virus("HIV-AIDS", "Trắng", 10);
        System.out.println("!!!!!!!--HIV AIDS--!!!!!!!\n"+hiv);
        
        virus ngheo = new virus("Nghèo", "Không màu", -00);
        System.out.println("!!!!!!!--VIRUS NGHÈO--!!!!!!!\n"+ngheo);
    }
}
