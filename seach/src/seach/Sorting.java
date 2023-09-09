/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seach;

import java.util.Random;
import java.util.Scanner;

public class Sorting {

    public static void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int size_array = ThuVien.getInt("Nhap so nguyen duong: ");
        int[] array = ThuVien.creatArray(size_array);
        System.out.println("Truoc khi sap xep:");
        ThuVien.display(array);
        System.out.println("------");
        buddleSort(array);
        System.out.println("Sau khi sap xep:");
        ThuVien.display(array);
    }

}
