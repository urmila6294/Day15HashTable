package com.bridgelabz.hashtable;


    public class NewLinkList<K extends Comparable> {
        public INode<K> head;
        public INode<K> tail;

        public NewLinkList() {
            this.head = null;
            this.tail = null;
        }

        public void add(INode<K> newNode) {
            if (this.tail == null) {
                this.tail = newNode;
            }
            if (this.head == null) {
                this.head = newNode;

            } else {
                INode<K> tempNode = this.head;
                this.head = newNode;
                this.head.setNext(tempNode);
            }
        }

        public void append(INode<K> newNode) {
            if (this.head == null) {
                this.head = newNode;
            }
            if (this.tail == null) {
                this.tail = newNode;
            } else {
                this.tail.setNext(newNode);
                this.tail = newNode;
            }
        }

        public INode<K> pop() {
            INode<K> tempNode = this.head;
            this.head = head.getNext();
            return tempNode;
        }

        public INode<K> popLast() {
            INode<K> tempNode = this.head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }

            this.tail = tempNode;
            tempNode = tempNode.getNext();
            return tempNode;
        }

        public INode<K> search(K key) {
            INode<K> tempNode = head;
            while (tempNode != null && tempNode.getNext() != null) {
                if (tempNode.getKey().equals(key)) {
                    return tempNode;
                }
                tempNode = tempNode.getNext();
            }
            return null;
        }

        public void printMyNodes() {
            System.out.println("My Nodes: " + head);
        }

        @Override
        public String toString() {
            return "NewLinkListNodes{" + head + '}';
        }

    }

