package org.example;

import java.util.ArrayList;
import java.util.List;

public class JunitTestCaseExample {

    private List<String> list=new ArrayList<>();
    public void remove(String name){
        list.remove(name);
    }
    public void add(String name){
        list.add(name);
    }

    public int sizeOfList() {
        return list.size();
    }
}
