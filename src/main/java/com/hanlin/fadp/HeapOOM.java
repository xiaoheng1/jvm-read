package com.hanlin.fadp;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    public static void main(String[] args) {
        List<HeapOOM> list = new ArrayList();
        for(;;){
            list.add(new HeapOOM());
        }
    }
}
