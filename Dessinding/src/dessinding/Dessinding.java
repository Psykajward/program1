/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessinding;

/**
 *
 * @author Mahmoud Osman
 */
public class Dessinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 4, 5};

        Sortable quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("QuickSort: " + java.util.Arrays.toString(array));

    }
}
    

