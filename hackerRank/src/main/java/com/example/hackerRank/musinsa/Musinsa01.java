package com.example.hackerRank.musinsa;

import java.util.ArrayList;
import java.util.HashMap;

public class Musinsa01 {

    private final HashMap<String, String> HASH_MAP = new HashMap<>();
    private final ArrayList<String> ARRAY_LIST = new ArrayList<>();
    private final int MAX = 5;
    private int COUNT = 0;

    public static void main(String[] args) {
        System.out.println("start");
    }

    public static void musinsa01test() {

    }


    public String getData(String key) {
        String text = HASH_MAP.getOrDefault(key, "");

        if ("".equals(text)) {
            text = getDb(key);
            setHashMapData(key, text);
        }


        return text;
    }

    private void setHashMapData(String key, String value) {
        if (MAX == HASH_MAP.size()) {
            String s = ARRAY_LIST.get(COUNT);
            HASH_MAP.remove(s);
            COUNT++;
        }
        ARRAY_LIST.set(COUNT, key);
        HASH_MAP.put(key, value);
    }

    public String getDb(String key) {
        return key + " GET_DB_DATA";
    }
}
