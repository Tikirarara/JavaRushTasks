package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int curLenght = 0;
        for (int i = 0; i < 10; i++) {
            String word = br.readLine();
            words.add(word);
        }
        for (String word : words) {
            if (curLenght < word.length())
                curLenght = word.length();
            else {
                System.out.println(words.indexOf(word));
                break;
            }
        }
    }
}

