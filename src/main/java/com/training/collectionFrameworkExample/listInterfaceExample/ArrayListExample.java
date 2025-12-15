package com.training.collectionFrameworkExample.listInterfaceExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");   // Duplicates are allowed

        System.out.println(languages);

        System.out.println(languages.set(2, "Perl"));

        System.out.println(languages);

        System.out.println("First element: " + languages.get(0));
        System.out.println("Size: " + languages.size());

        Iterator<String> it = languages.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
