package org.example;

import org.example.interatorpattern.Iterator;
import org.example.interatorpattern.NameRepository;

public class ClientApplication {
    public static void main(String[] args) {
        NameRepository<String> nameRepository = new NameRepository<>();
        for (Iterator<String> iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = iterator.next();
            System.out.println("Name : " + name);
        }
    }
}