/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author CongThanh
 */
import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author ACER
 */
public class SeachPrograming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SeachPrograming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("The array: ");
                library.display(array);
                int number = library.getInt("Input number to search: ");
                System.out.println("\nSearched by Linear Search: ");
                System.out.println("Found " + number + " at index: "
                        + algorithm.linearSearch(array, number));
                break;
            case 2:
                System.out.println("The array: ");
                library.display(array);
                algorithm.buddleSort(array);
                System.out.println("The array after sorting: ");
                library.display(array);
                int value = library.getInt("Input number to search: ");
                System.out.println("\nSearched by Binary Search: ");
                System.out.println("Found " + value + " at index: "
                        + algorithm.binarySearch(array, 0, array.length, value));
                break;
            case 3:
                System.exit(0);
        }
    }

}
