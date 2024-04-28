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

public class TestFungsionalString{
    private String randomText;
    private Integer randomTextLength;
    private Random r;
    @BeforeTest
    public void iniTest() {
        r = new Random();
        randomText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        randomTextLength = 0;

        randomTextLength = panjangTextrandom (60);
        randomText = isiTextRandom(randomText, randomTextLength);
    }

    @Test (priority = 0)
    public void getStringLength(){
        // Ekspektasi panjang kata akan sama dengan panjang kata yang diacak
        int expectedLength = randomText.length();
        System.out.println(randomText);
        System.out.println(expectedLength);

        // Memanggil fungsi 'getStringLength'
        int actualLength = new FungsionalString().getStringLength(randomText);

        System.out.println(" Expected : " + expectedLength);
        System.out.println(" Actual: " + actualLength);

        //Assertion untuk memastikan pajang yang diharapkan sama dengan panjang keadaan
        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test (priority = 1)
    public void getCharFromString (){
        // Generate integer acak dalam dari indeks 0 sampai (panjangTextRandom - 1)
        int randomPoint = r.nextInt(randomTextLength);
        System.out.println(randomPoint);

        // Expected karakter adalah karakter yang dihasilkan dari randomPoint
        char expectedChar = randomText.charAt(randomPoint);

        //Memanggil fungsi 'getCharFunctionalString
        char actualChar = new FungsionalString().getCharFromString(randomText, randomPoint);

        System.out.println(" Expected : " + expectedChar);
        System.out.println(" Actual : " + actualChar);

        //Assertion untuk memastikan pajang yang diharapkan sama dengan panjang keadaan
        Assert.assertEquals(expectedChar, actualChar);
    }

    // Fungsi untuk random panjang text
    public static int panjangTextrandom(int panjangMaks){
        Random random = new Random();
        return random.nextInt(panjangMaks) + 1; // menghitung panjang text dari 1 sampai panjang maksimal
    }
    // Fungsi untuk random isi text
    public  static  String isiTextRandom (String text, int panjangAcak){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < panjangAcak; i++){
            int indeksAcak = random.nextInt(text.length()); //Mengambil indeks random karakter
            char charAcak = text.charAt(indeksAcak); //Mendapatkan karakter di indeks acak
            sb.append(charAcak);
        }

        return sb.toString();
    }

}


