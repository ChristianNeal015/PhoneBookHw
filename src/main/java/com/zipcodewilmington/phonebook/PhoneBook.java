package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;
    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }
    public PhoneBook() {
        this(new HashMap<String, List<String>>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> phonebook = new ArrayList();
        phonebook.add(phoneNumber);
        map.put(name, phonebook);
    }

    public void addAll(String name, String... phoneNumbers) {
        List numbers = Arrays.asList(phoneNumbers);


    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
