import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        try
        {
            String filename = "./words/alpha.txt";

            File file = new File(filename);
            Scanner in = new Scanner(file);

            while (in.hasNextLine())
            {
                String str = in.nextLine();
                arrayList.add(str);
                linkedList.add(str);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }

        callArrayListGet(arrayList);
        callLinkedListGet(linkedList);
        callArrayListIterate(arrayList);
        callLinkedListIterate(linkedList);
        callArrayListInsert(arrayList);
        callLinkedListInsert(linkedList);
        callArrayListRemove(arrayList);
        callLinkedListRemove(linkedList);
    }
    private static void testGetForList(List<String> list) {

        int reps = 10000;
        int quantity = reps / 10;

        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < quantity; j++) { list.get(j); }
        }

    }
    private static void testIterateForList(List<String> list) {
        int reps = 10000;

        for (int i = 0; i < reps; i++) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) { it.next(); }
        }
    }
    private static void testInsertForList(List<String> list) {
        int reps = 10000;
        int half = list.size()/2;
        String s = "test";
        ListIterator<String> it = list.listIterator(half);

        for(int i = 0; i < reps * 10; i++)
                it.add(s);


    }
    private static void testRemoveForList(List<String> list) {
        ListIterator<String> it = list.listIterator(3);
        while(it.hasNext()) { it.next(); it.remove(); }
    }


    private static void testGetForArrayList(ArrayList<String> list) {
        testGetForList(list);
    }
    private static void testGetForLinkedList(LinkedList<String> list) {
        testGetForList(list);
    }
    private static void testIterateForArrayList(ArrayList<String> list) {
       testIterateForList(list);
    }
    private static void testIterateForLinkedList(LinkedList<String> list) {
        testIterateForList(list);
    }
    private static void testInsertForArrayList(ArrayList<String> list) {
        testInsertForList(list);
    }
    private static void testInsertForLinkedList(LinkedList<String> list) {
        testInsertForList(list);
    }
    private static void testRemoveForArrayList(List<String> list) {
        testRemoveForList(list);
    }
    private static void testRemoveForLinkedList(List<String> list) {
        testRemoveForList(list);
    }

    private static void callArrayListGet(ArrayList<String> list) {
        long before = System.currentTimeMillis();
        testGetForArrayList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callLinkedListGet(LinkedList<String> list) {
        long before = System.currentTimeMillis();
        testGetForLinkedList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callArrayListIterate(ArrayList<String> list) {
        long before = System.currentTimeMillis();
        testIterateForArrayList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callLinkedListIterate(LinkedList<String> list) {
        long before = System.currentTimeMillis();
        testIterateForLinkedList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callArrayListInsert(ArrayList<String> list) {
        long before = System.currentTimeMillis();
        testInsertForArrayList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callLinkedListInsert(LinkedList<String> list) {
        long before = System.currentTimeMillis();
        testInsertForLinkedList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callArrayListRemove(ArrayList<String> list) {
        long before = System.currentTimeMillis();
        testRemoveForArrayList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    private static void callLinkedListRemove(LinkedList<String> list) {
        long before = System.currentTimeMillis();
        testRemoveForLinkedList(list);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }





}


