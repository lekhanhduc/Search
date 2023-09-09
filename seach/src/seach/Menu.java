/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seach;

import java.util.Arrays;
import java.util.Scanner;



public class Menu {
public Scanner sc = new Scanner(System.in);
public Menu(){
    sc = new Scanner(System.in);
    

       
}
public void displayMenu(){
    System.out.println("Lua Chon Tim Kiem: ");
    System.out.println("1.Search BinarySearch");
    System.out.println("2.Search LinearSearch");
    System.out.println("3.Exit");
}
public void   handleChoice(int choice, int[] array) {
    switch(choice){
            case 1:
                System.out.print("Nhap Phan Tu Can Tim: ");
                int target = sc.nextInt();
                int linearSearchResult = linearSearch(array, target);
                if (linearSearchResult != -1) {
                    System.out.println("Phan Tu " + target + " Duoc Tim Thay Tai Vi Tri " + linearSearchResult);
                } else {
                    System.out.println("Khong Tim Thay Phan Tu " + target);
                }
                break;
            case 2:
                System.out.print("Nhap Phan Tu Can Tim: ");
                int targetBinary = sc.nextInt();
                int binarySearchResult = Arrays.binarySearch(array, targetBinary);
                if (binarySearchResult >= 0) {
                    System.out.println("Phan Tu " + targetBinary + " Duoc Tim Thay Tai Vi Tri " + binarySearchResult);
                } else {
                    System.out.println("Khong Tim Thay Phan Tu " + targetBinary);
                }
                break;
            case 3:
                System.out.println("Thoat Khoi Chuong Trinh...");
                System.exit(0);
                break;
            default:
                System.out.println("Lua Chon Khong Hop Le");
        }
}

    private int linearSearch(int[] array, int target) {
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    }


        
    

   
    



