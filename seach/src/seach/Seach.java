/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seach;

/**
 *
 * @author lekha
 */


import java.util.Scanner;

public class Seach {

    public static void main(String[] args) {
        int size_array = ThuVien.getInt("Nhap so nguyen duong: ");
        int[] array = ThuVien.creatArray(size_array);
        System.out.println("Truoc khi sap xep:");
        ThuVien.display(array);
        System.out.println("");
        Sorting.buddleSort(array);
        System.out.println("Sau khi sap xep:");
        ThuVien.display(array);
        int value = ThuVien.getInt("\nNhap so can tim: ");
        System.out.println("");
        System.out.println("Phan Tu:" + value + " Duoc Tim Thay Tai : " + binarySearch(array, value, 0, size_array - 1));
        Menu menu = new Menu();
        int choice;
        while (true) {
            menu.displayMenu();
            choice = menu.sc.nextInt();
            menu.handleChoice(choice, array);
        }
    }

    private static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
    }
    
    public static int linearSearch(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
