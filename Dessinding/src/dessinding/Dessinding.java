/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessinding;
import java.util.Scanner;
import java.util.ArrayList;


public class Dessinding {
    public static void main(String[] args) {
       Scanner elem = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter The Size: ");
        int size = s.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter The Element: ");
            int element = elem.nextInt();
            list.add(element);
        }
        System.out.println("The List = " + list);
        
        QuickSort sort2 = new QuickSort();
        sort2.sort(list);
        System.out.println("Sorted lise (QuickSort): " + list);
        
        System.out.println("Then the sort with the MergeSort is =>");
        
        // MergeSort
        MergeSort sorter1 = new MergeSort();
        sorter1.sort(list);
        System.out.println("Sorted list (MergeSort): " + list);
        
        // QuickSort
        
    }
}
    

