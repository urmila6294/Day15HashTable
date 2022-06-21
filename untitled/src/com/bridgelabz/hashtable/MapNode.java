package com.bridgelabz.hashtable;

    public class MapNode<K extends Comparable, V> implements INode<K> {
        K key;
        V value;
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        @Override
        public K getKey() {

            return key;
        }

        @Override
        public void setkey(K key) {

        }

        public void setKey(K key) {

            this.key = key;
        }


        public INode<K> getNext() {
            // TODO Auto-generated method stub
            return next;
        }

        public V getValue() {
            return value;
        }


        public void setValue(V value) {
            this.value = value;
        }


        public void setNext(INode<K> next) {
            this.next = (MapNode<K, V>) next;

        }

        @Override
        public String toString() {
            StringBuilder MapNodeString = new StringBuilder();
            MapNodeString.append("MapNode{" + "K=")
                    .append(key).append("V=").append(value).append('}');
            if (next != null)
                MapNodeString.append("->").append(next);
            return MapNodeString.toString();
        }
    }

