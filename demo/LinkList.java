package com.example.demo;

public class LinkList {
    public Node add(Node head, Node node) {
        if (head == null) {
            return node;
        }
        Node tmp = head;
        Node node1 = new Node();
        node1.setData(node.getData());
        node = node1;
        if (tmp.getNext() == null) {
            if (tmp.getData() == null) {
                tmp.setData(node.getData());
            } else {
                tmp.setNext(node);
            }
            return tmp;
        }
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(node);
        return head;
    }

    public Node remove(Node head, String data) {
        if (head == null) {
            return head;
        }
        Node tmp = head;
        if (tmp.getData().equals(data)) {
            head = head.getNext();
            return head;
        }
        while (tmp.getNext() != null) {
            if (!tmp.getNext().getData().equals(data)) {
                tmp = tmp.getNext();
            } else {
                tmp.setNext(tmp.getNext().getNext());
                return head;
            }
        }
        return head;
    }

    public void print(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.println(head.getData());
        while (head.getNext() != null) {
            System.out.println(head.getNext().getData());
            head = head.getNext();
        }
    }

    public Node LRU(Node head, String data) {
        Node tmp = head;
        //设置单向链表最大长度
        Node preLast = new Node();
        int length = 3;
        int i = 1;
        //1. 如果此数据之前已经被缓存在链表中了，我们遍历得到这个数据对应的结点，并将其从原来的位置删除，然后再插入到链表的头部。
        if (tmp.getData().equals(data)) {
            head = head.getNext();
            return head;
        }
        while (tmp.getNext() != null) {
            i++;
            preLast = tmp;
            if (!tmp.getNext().getData().equals(data)) {
                tmp = tmp.getNext();
            } else {
                tmp.setNext(tmp.getNext().getNext());
                Node newNode = new Node();
                newNode.setData(data);
                newNode.setNext(head);
                return newNode;
            }
        }
        // 如果此数据没有在缓存链表中 如果此时缓存未满，则将此结点直接插入到链表的头部；
        if (i < length) {
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(head);
            return newNode;
        } else {
            //如果此时缓存已满，则链表尾结点删除，将新的数据结点插入链表的头部。
            preLast.setNext(null);
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(head);
            return newNode;
        }
    }

    //单链表反转
    public Node reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node pre = null;
        Node cur = head;
        Node next = null;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //链表中环的检测
    public boolean checkIsRing(Node head) {
        if (head == null || head.getNext() == null) {
            return false;
        }
        Node tmp1 = head;
        Node tmp2 = head;
        while (tmp1 != null) {
            tmp2 = tmp1.getNext();
            while (tmp2 != null) {
                if (tmp1.equals(tmp2)) {
                    return true;
                }
                tmp2 = tmp2.getNext();
            }
            tmp1 = tmp1.getNext();
        }
        return false;
    }
    //链表中环的检测 快慢指针算法
    public boolean checkIsRingN(Node head) {
        if (head == null || head.getNext() == null) {
            return false;
        }
        Node tmp1 = head;
        Node tmp2 = head;
        while (tmp1 != null&&tmp2.getNext().getNext()!=null) {
            tmp1=tmp1.getNext();
            tmp2=tmp2.getNext().getNext();
            if(tmp1==null){
                return false;
            }else if(tmp1==tmp2){
                return true;
            }
        }
        return false;
    }
    //两个有序的链表合并
    public Node merge(Node head1, Node head2) {
        Node tmp1 = head1;
        Node tmp2 = head2;
        Node result = new Node();
        Node newHead = result;
        if (head1 == null) {
            if (head2 == null) {
                return head1;
            } else {
                return head2;
            }
        } else {
            if (head2 == null) {
                return head1;
            } else {
                while (tmp1 != null) {
                    int i = Integer.valueOf(tmp1.getData());
                    int j = Integer.valueOf(tmp2.getData());
                    if (i <=j) {
                        newHead.setNext(tmp1);
                        tmp1 = tmp1.getNext();
                    } else {
                        newHead.setNext(tmp2);
                        tmp2=tmp2.getNext();
                    }
                    newHead=newHead.getNext();
                    if (tmp1 == null && tmp2 != null) {
                        newHead.setNext(tmp2);
                        return result;
                    }
                    if (tmp2 == null && tmp1 != null) {
                        newHead.setNext(tmp1);
                        return result;
                    }

                }
            }
        }

        return result;
    }

    //删除链表倒数第n个节点
    public Node deleteDescN(Node head,int m){
        if(head==null){
            return head;
        }
        Node tmp=head;
        int n=1;
        while (tmp.getNext()!=null){
            tmp=tmp.getNext();
            n++;
        }
        n=n-m+1;
        tmp=head;
        int cur=2;
         while (tmp.getNext()!=null){
             if(n==1){
                 tmp=tmp.getNext();
                 return tmp;
             }else if(cur==n){
               tmp.setNext(tmp.getNext().getNext());
                return head;
             }else{
                 tmp=tmp.getNext();
                 cur++;
             }
         }
        return head;
    }

    //求链表的中间结点
    public String getCenterNode(Node head){
        if(head==null){
            return null;
        }
        if(head.getNext()==null){
            return head.getData();
        }
        Node tmp=head;
        int n=1;
        while (tmp.getNext()!=null){
            tmp=tmp.getNext();
            n++;
        }
        int center=n>>1;
        tmp=head;
        int i=1;
        while (tmp!=null){
            if(i==center){
                return tmp.getData();
            }
            tmp=tmp.getNext();
            i++;
        }
        return tmp.getData();
    }

}
