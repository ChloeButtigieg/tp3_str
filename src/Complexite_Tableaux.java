
/**
 *  Complexite_Tableaux.java
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



public class Complexite_Tableaux
{
    public static void main(String[] args) throws IOException {

        Writer file = new FileWriter("ascendingFilling.dat");
        SelectionSortedArrayWithCounting arraySelectionSorted = new SelectionSortedArrayWithCounting();
        InsertionSortedArrayWithCounting arrayInsertionSorted = new InsertionSortedArrayWithCounting();
        MergeSortedArrayWithCounting arrayMergeSorted = new MergeSortedArrayWithCounting();

        for (int length = 1; length < 1000; length++) {
            arraySelectionSorted.fillAscending(length);
            arrayInsertionSorted.fillAscending(length);
            arrayMergeSorted.fillAscending(length);

            arraySelectionSorted.SelectionSorting();
            arrayInsertionSorted.InsertionSorting();
            arrayMergeSorted.MergeSorting();
            file.write(length + " " + arraySelectionSorted.getreadCount() + " " + arrayInsertionSorted.getreadCount() + " " + arrayMergeSorted.getreadCount() + "\n");
        }

        file.close();

        /*SelectionSortedArrayWithCounting tab = new SelectionSortedArrayWithCounting();

        tab.fillwithRandom(40,20);


        System.out.println(tab.toString());

        tab.SelectionSorting();

        System.out.println(tab.toString());

        System.out.println("nombre de lectures : "
                +String.valueOf(tab.getreadCount()));

        System.out.println("nombre d'écritures : "
                +String.valueOf(tab.getwriteCount()));

        System.out.println("nombre de comparaisons : "
                +String.valueOf(tab.getlessCount()));*/

    }
}
    
    
    
   