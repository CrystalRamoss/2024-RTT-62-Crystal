package org.example.SBA2;
import java.util.*;

interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}

class InvalidStringException extends Exception{
    public InvalidStringException(String message) {
        super(message);
    }
}

class ArrayToList implements MyList {
    private ArrayList<String> arrayToList;

    public ArrayToList() {
        this.arrayToList = new ArrayList<>();
    }

    public void convert(String[] a){
        for (int pos = 0; pos < a.length; pos++) {
            arrayToList.add(a[pos]);
            System.out.println("I have added the string: " + a[pos] + " at the index: " + pos);
        }
    }


    public void replace(int idx) {
        if (idx >= 0 && idx < arrayToList.size()) {
            String value = arrayToList.get(idx);
            arrayToList.set(idx, "");
            System.out.println("I have replaced the string: " + value + " with a null string");
        }
    }

    public ArrayList<String> compact() {
        ArrayList<String> result = new ArrayList<>();

        for (String s : arrayToList) {
            if (!s.equals("")) {
                result.add(s);
            }
        }
        return result;
    }
}

