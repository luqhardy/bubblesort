/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practise;

/**
 *
 * BasicBubbleSort
 */
import java.util.Scanner;
public class Practise {

    public static void main(String[] args) {
        int[] unsorted = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < unsorted.length; i++){
            unsorted[i] = input.nextInt();
        }
        bubbleSort(unsorted);
        System.out.println("Input 10 numbers in any order: ");
    }
    public static void bubbleSort(int[] unsorted){
        for(int j = 0; j < unsorted.length; j++){
            for(int i = 0; i < unsorted.length; i++){
                if(unsorted[i] > unsorted[i+1]){
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                }
            }      
        }
    }
    public static void printArray()
}
