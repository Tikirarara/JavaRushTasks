package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minLenght = 0;
        int minPosition = 0;
        int maxLenght = 0;
        int maxPosition = 0;
        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            lines.add(line);
            if (minLenght == 0 && maxLenght == 0)
                minLenght = maxLenght = line.length();
            if (minLenght > line.length()) {
                minLenght = line.length();
                minPosition = i;
            }
            if (maxLenght < line.length()) {
                maxLenght = line.length();
                maxPosition = i;
            }
        }
        if (minPosition > maxPosition)
            System.out.println(lines.get(maxPosition));
        else System.out.println(lines.get(minPosition));
    }
}
