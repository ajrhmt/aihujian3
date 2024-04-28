package com.juaracoding.aihujian3.ujian3;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 25/04/24 14.00
@Last Modified 25/04/24 14.00
Version 1.0
*/

/**
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Fungsional String
 */

public class FungsionalString {
    /** mengambil karakter dari index suatu string */
    public Character getCharFromString(String s, int intPointer){
        return s.charAt(intPointer);
    }

    /** mendapatkan informasi panjang string */
    public Integer getStringLength(String s){
        return s.length();
    }
}
