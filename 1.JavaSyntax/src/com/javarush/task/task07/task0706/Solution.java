package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] houses = new int[15];
        int chet = 0;
        int nechet = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            houses[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0)
                chet += houses[i];
            else nechet += houses[i];
        }
        if (chet > nechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
