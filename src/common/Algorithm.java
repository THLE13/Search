/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author CongThanh
 */
public class Algorithm {

    public void buddleSort(int[] array) {
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

    public int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, left, right - 1, value);
            } else {
                binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }

    public int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // target not found
    }
}
