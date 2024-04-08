package com.learning.core.day2session2;
import java.util.Scanner;
public class D02P043 {
	public static void main(String[] args) {
        int[] arr = {10,5,3,4,3,5,6}; 
        int position = findFirstRepetition(arr);
        System.out.println("The position of the first repetition is: " + position);
    }
 
    private static int findFirstRepetition(int[] arr) {
        int minPosition = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (j < minPosition) {
                        minPosition = j;
                    }
                }
            }
        }
        return (minPosition == arr.length + 1) ? -1 : minPosition + 1;
    }	
}