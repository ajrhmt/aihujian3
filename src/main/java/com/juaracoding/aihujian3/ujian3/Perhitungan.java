package com.juaracoding.aihujian3.ujian3;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 25/04/24 14.02
@Last Modified 25/04/24 14.02
Version 1.0
*/
/**
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Perhitungan
 */

public class Perhitungan {
    /** Fungsi aritmatika tambah-tambahan */
    public Integer tambah(String a, String b){

        return Integer.parseInt(a)+Integer.parseInt(b);
    }
    /** Fungsi aritmatika pengurangan */
    public Double kurang(String a, String b){
        double douKurang = Integer.parseInt(a)-Integer.parseInt(b);
        return douKurang;
    }
    /** Fungsi aritmatika perkalian */
    public Double kali(String a, String b){
        double douKali = Integer.parseInt(a)*Double.parseDouble(b);
        return douKali;
    }
    /** Fungsi aritmatika pembagian */
    public Double bagi(String a, String b){
        double douBagi = Integer.parseInt(a)/Double.parseDouble(b);
        return douBagi;
    }

    /** Fungsi aritmatika modulus */
    public Integer modulus(String a , String b){
        return Integer.parseInt(a)%Integer.parseInt(b);
    }
}
