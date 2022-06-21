package com.bridgelabz.hashtable;

public class HashMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Hashtable Program");
        String sentence = "to be or not to be";
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word: words) {
            hashMap.get(word);
            Integer value = hashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.add(word,value);
        }
        int frequency = hashMap.get("to");
        System.out.println(hashMap);
    }
}
