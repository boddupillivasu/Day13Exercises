package com.exercises;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ecercise4 {
    public static void main(String[] args) {


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("blue");
        linkedList.add("red");
        linkedList.add("black");
        linkedList.add("green");
        linkedList.add("orange");


        String rm = linkedList.remove(0);
        System.out.println("removed element at specific position at 0 is " + rm);
        System.out.println("After remove");
        String rm1 = linkedList.remove(3);
        System.out.println("removed element at specific position at 4 is " + rm1);
        System.out.println("After remove");
        System.out.println(linkedList);

        Iterator<String> stringIterator = linkedList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }


    }
}
