package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner reader = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int a = reader.nextInt();
                list.add(a);
            }
        } catch (Exception e) {
            for (Integer i : list) {
                System.out.println(i);
            }
        }

    }
}
