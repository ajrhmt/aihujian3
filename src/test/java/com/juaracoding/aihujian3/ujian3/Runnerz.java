package com.juaracoding.aihujian3.ujian3;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 28/04/24 16.35
@Last Modified 28/04/24 16.35
Version 1.0
*/

import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Runnerz {
    public static void main(String[] args) {

        TestNG runner = new TestNG();
        runner.setOutputDirectory("D:\\output-testng\\"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));
        List<String> suitefiles = new ArrayList<String>();
        for (int i = 0; i < 2 ; i++) {
            suitefiles.add("D:\\ForModul\\aihujian3\\testcombinationfirst.xml");
            runner.setTestSuites(suitefiles);
        }
        for (int i = 0; i < 3 ; i++) {
            suitefiles.add("D:\\ForModul\\aihujian3\\dibedakan.xml");
            runner.setTestSuites(suitefiles);
        }
        runner.run();
    }
}
