package com.bridgelabz.hashtable;

public class HashMain {

    public static void main(String[] args) {
        System.out.println("Welcome To Hashtable Program");
        String sentence = "Paranoid are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ;		HashMap<String,Integer> hashMap = new HashMap<>();
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
        System.out.println(hashMap);
        int frequency = hashMap.get("paranoid");
        System.out.println("Frequency of paranoid is :"+frequency);
    }

}
