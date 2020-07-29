package com.example.demo;

public class LinkListQueue {

    private Node item;
    //队列中元素个数
    private int count;

    public Node getData() {
        return item;
    }

    public void setData(Node data) {
        this.item = data;
    }

    public void enQueue(String data) {
        Node tmp = new Node();
        tmp.setData(data);
        item.setNext(tmp);
        count++;
    }

    public String deQueue() {
        if (this.count == 0) {
            return null;
        }
        String tmp = item.getData();
        item = item.getNext();
        count--;
        return tmp;
    }
}
