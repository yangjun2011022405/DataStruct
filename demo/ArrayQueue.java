package com.example.demo;

public class ArrayQueue {

    private String[] item;
    //队列中元素个数
    private int count;
    //队列的长度
    private int n;
    //队列头指针
    private int head;
    //队列中的尾指针
    private int tail;
    public void ArrayQueue(int n) {
        this.item = new String[n];
        this.n = n;
        this.count = 0;
    }
    public String[] getData() {
        return item;
    }

    public void setData(String[] data) {
        this.item = data;
    }

    public boolean enQueue(String data) {
        if (n == count) {
            return false;
        } else {
            item[tail] = data;
            this.tail++;
            this.count++;
        }
        return false;
    }

    public String deQueue() {
        if (this.count == 0) {
            return null;
        } else {
            String tmp = item[head];
            this.count--;
            this.head++;
            return tmp;
        }
    }
}
