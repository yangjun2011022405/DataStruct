package com.example.demo;

public class LinkListStack {

    private Node item;
    //栈中元素个数
    private int count;

    public Node getData() {
        return item;
    }

    public void setData(Node data) {
        this.item = data;
    }

    public void push(String data) {
        Node old = item;
        Node tmp = new Node();
        tmp.setData(data);
        item = tmp;
        item.setNext(old);
        count++;
    }

    public String pop() {
        String tmp = item.getData();
        item = item.getNext();
        count--;
        return tmp;
    }
}
