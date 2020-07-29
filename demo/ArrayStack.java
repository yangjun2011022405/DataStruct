package com.example.demo;

public class ArrayStack {

    private String[] item;
    //栈中元素个数
    private int count;
    //栈的长度
    private int n;

    public void ArrayStack(int n) {
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

    public boolean push(String data) {
        if (n == count) {
            return false;
        } else {
            item[count] = data;
            this.count++;
        }
        return false;
    }

    public String pop() {
        if (this.count == 0) {
            return null;
        } else {
            String tmp = item[count - 1];
            this.count--;
            return tmp;
        }
    }
}
