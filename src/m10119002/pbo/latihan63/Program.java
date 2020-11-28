/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan63;

import m10119002.pbo.latihan63.target.Koordinat;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi Gradien Garis Lurus
 * main class
 * 
 */
public class Program {
    public static void main(String[] args) {
        Koordinat a = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (2,10) dan (5,7)");
        System.out.println("memiliki gradien sebesar ".
                concat(Integer.toString(a.hitungGradien())));
        
        Koordinat b = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (5,1) dan (3,12)");
        System.out.println("memiliki gradien sebesar ".
                concat(Integer.toString(b.hitungGradien())));
    }
}
