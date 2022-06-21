package com.bridgelabz.hashtable;
import java.util.ArrayList;
public class HashMap<K extends Comparable, V> {
    MyLinkedList<K> linkList;

    public HashMap() {
        this.linkList = new MyLinkedList<>();
    }

    public V get(K key) {
        MapNode<K,V> mapNode =(MapNode<K, V>)this.linkList.search(key);
        return (mapNode == null)? null : mapNode.getValue();
    }
    public void add(K key, V value) {
        MapNode<K,V> mapNode =(MapNode<K,V>)this.linkList.search(key);
        if(mapNode == null) {
            mapNode = new MapNode<>(key ,value);
            this.linkList.append(mapNode);
        }
        else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "HashMapNodes{" + linkList + '}';
    }

}


