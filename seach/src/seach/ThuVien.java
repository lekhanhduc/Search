/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seach;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lekha
 */
public class ThuVien {
    public static int getInt(String s) {
       Scanner sc = new Scanner(System.in);
       int size_Array =0;
       String input;
       do{
           System.out.println(s);
           input = sc.nextLine();
           if (input.isEmpty()){
               
           System.out.println("Input khong duoc trong...");
           continue;
       }else{
           size_Array = Integer.parseInt(input);
               break;
           }  
       }while(true);
       return size_Array;
} 

public static int[] creatArray(int size_array) {
        int[] array = new int[size_array];
        Random rd = new Random();
        for (int i = 0; i < size_array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
 public static void display(int[] array) {
    
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }
        }
    }

}