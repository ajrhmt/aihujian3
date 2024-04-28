package com.juaracoding.aihujian3.ujian3;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 25/04/24 14.14
@Last Modified 25/04/24 14.14
Version 1.0
*/
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
public class TestPerhitungan {
    private int angkaPertama;
    private int angkaKedua;
    private Random r;
    private Perhitungan p;
    @BeforeTest
    public void iniTest (){
        r = new Random();
        p = new Perhitungan();

        angkaPertama = r.nextInt(100) + 1;
        angkaKedua = r.nextInt(100) + 1;
    }
    @Test (priority = 1)
    public  void Perkalian(){
        double actual = 0;
        double expected = 0;
        System.out.println("bilangan pertama : " +angkaPertama+ " bilangan kedua : " +angkaKedua);

        actual = p.kali(String.valueOf(angkaPertama), String.valueOf(angkaKedua));
        expected = angkaPertama * angkaKedua;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        //Melakukan Assertion Terhadap Hasil Yang Diharapkan
        Assert.assertEquals(actual, expected, "Hasil Tidak Sama");
    }


    @Test (priority = 2)
    public  void modulus(){
        double actual = 0;
        double expected = 0;
        System.out.println(" bilangan pertama : " +angkaPertama+ " bilangan kedua : " +angkaKedua);

        actual = p.modulus(String.valueOf(angkaPertama), String.valueOf(angkaKedua));
        expected = angkaPertama % angkaKedua;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        //Melakukan Assertion Terhadap Hasil Yang Diharapkan
        Assert.assertEquals(actual, expected, "Hasil Tidak Sama");
    }


    @Test (priority = 3)
    public void pembagian(){
        double actual = 0;
        double expected = 0;
        System.out.println(" bilangan pertama : " + angkaPertama + " bilangan kedua : " + angkaKedua);

        actual = p.bagi(String.valueOf(angkaPertama), String.valueOf(angkaKedua));
        expected = (double) angkaPertama/angkaKedua;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        //Melakukan Assertion Terhadap Hasil Yang Diharapkan
        Assert.assertEquals(actual, expected, "Hasil Tidak Sama");
    }


    @Test (priority = 4)
    public void pengurangan(){
        double actual = 0;
        double expected = 0;
        System.out.println(" bilangan pertama : " + angkaPertama + " bilangan kedua : " + angkaKedua);

        actual = p.kurang(String.valueOf(angkaPertama), String.valueOf(angkaKedua));
        expected = angkaPertama - angkaKedua;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        //Melakukan Assertion Terhadap Hasil Yang Diharapkan
        Assert.assertEquals(actual, expected, "Hasil Tidak Sama");
    }


    @Test (priority = 5)
    public void penambahan(){
        double actual = 0;
        double expected = 0;
        System.out.println(" bilangan pertama : " + angkaPertama + " bilangan kedua : " + angkaKedua);

        actual = p.tambah(String.valueOf(angkaPertama), String.valueOf(angkaKedua));
        expected = angkaPertama + angkaKedua;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        //Melakukan Assertion Terhadap Hasil Yang Diharapkan
        Assert.assertEquals(actual, expected, "Hasil Tidak Sama");
    }
}

