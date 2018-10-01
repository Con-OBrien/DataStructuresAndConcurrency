import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            String filename = "words_alpha.txt"; //file in project folder
            //String filename = "C:\\Users\\t00012345\\Desktop\\words_alpha.txt"; //can have file in any folder

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine()) {
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    long startTime, endTime, timeTaken;
        // call testGetForArrayList, testGetForLinkedList,  testInsertForArrayList etc to test get, insert and remove for ArrayList and LinkedList.
        /*long startTime = System.currentTimeMillis();
        testGetForArrayList(arrList);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime-startTime;
        System.out.println("time for ArrayList get "+ timeTaken);

        startTime = System.currentTimeMillis();
        testGetForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList get "+ timeTaken); */

        startTime = System.currentTimeMillis();
        testIterateForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for ArrayList iterate "+ timeTaken);

        startTime = System.currentTimeMillis();
        testIterateForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList iterate "+ timeTaken);

      /*  startTime = System.currentTimeMillis();
        testInsertForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for ArrayList insert "+ timeTaken);

        startTime = System.currentTimeMillis();
        testInsertForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList insert "+ timeTaken);

        startTime = System.currentTimeMillis();
        testRemoveForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for ArrayList remove "+ timeTaken);

        startTime = System.currentTimeMillis();
        testRemoveForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList remove "+ timeTaken); */


        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler
    }

    public static void testGetForArrayList(List list) {
        testGetForList(list);
    }

    public static void testGetForLinkedList(List list) {
        testGetForList(list);
    }

    public static void testGetForList(List list) {
        int reps = 15000;
        for (int i = 0; i < reps; i++) {
// reps is the number of repetitions
// declare reps as something large e.g. 10000
            int quantity = reps / 10;
            for (int j = 0; j < quantity; j++) // declare quantity reps/10
            // depends on your list size
            {
                list.get(j); // list is your list
            }			        // (ArrayList or LinkedList)

        }
    }
    public static void testIterateForArrayList (List list)
    {
        long iterateArrayTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }

        iterateArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterate Array = " +iterateArrayTime);
    }

    public static void testIterateForLinkedList(List list)
    {
        long iterateLinkedTime;
        long startTime = System.currentTimeMillis();
        int reps = 10000;

        for(int i = 0; i < reps; i++)
        {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }

        iterateLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterate Linked = " +iterateLinkedTime);
    }

    public static void testInsertForArrayList(List list)
    {
        long insertArrayTime;
        long startTime = System.currentTimeMillis();
        int half = list.size()/2;
        int reps = 10000;
        String s = "test";
        ListIterator it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
        {
            it.add(s);
        }

        insertArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Insert Array = " +insertArrayTime);
    }

    public static void testInsertForLinkedList(List list)
    {
        long insertLinkedTime;
        long startTime = System.currentTimeMillis();
        int half = list.size()/2;
        int reps = 10000;
        String s = "test";
        ListIterator it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
        {
            it.add(s);
        }

        insertLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Insert Linked = " +insertLinkedTime);
    }

    public static void testRemoveForArrayList(List list)
    {
        long removeArrayTime;
        long startTime = System.currentTimeMillis();
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }

        removeArrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Remove Array = " +removeArrayTime);
    }

    public static void testRemoveForLinkedList(List list)
    {
        long removeLinkedTime;
        long startTime = System.currentTimeMillis();
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }

        removeLinkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Remove Linked = " +removeLinkedTime);
    }

}
