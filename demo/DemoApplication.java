package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        List<Integer> arr = new ArrayList<>(10000000);
//
//        for (int i = 0; i < 10000000; i++) {
//            arr.add(i);
//        }
//        Collections.shuffle(arr);
//        long endTime = System.currentTimeMillis();
//        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        // for (int i = 0; i < 10000000; i++) {
        //     System.out.println(arr.get(i));
        // }

        // SpringApplication.run(DemoApplication.class, args);
        Node linkList = new Node();
        Node node1 = new Node();
        node1.setData("1");
        Node node2 = new Node();
        node2.setData("2");
        // node1.setNext(node2);
        Node node3 = new Node();
        node3.setData("3");
        //  node2.setNext(node3);
        // node1.print(node1);
        Node node4 = new Node();
        node4.setData("4");
        LinkList linkListNew = new LinkList();
        linkList = linkListNew.add(linkList, node1);
        linkList = linkListNew.add(linkList, node2);
        linkList = linkListNew.add(linkList, node3);
        linkList = linkListNew.add(linkList, node4);
        //  linkList = linkListNew.add(linkList, node3);
//        linkListNew.print(linkList);
//        System.out.println(">>>>>>>>>>>>>>>>>>");
//        linkList= linkListNew.remove(linkList,"3");
//        linkListNew.print(linkList);
//
//        System.out.println("LRU>>>>>>>>>>>>>>>>>>");
//        //LRU
//        linkList =   linkListNew.LRU(linkList,"2");
//        linkListNew.print(linkList);
//        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkList =   linkListNew.LRU(linkList,"5");
//        linkListNew.print(linkList);
//
//        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkList =   linkListNew.LRU(linkList,"6");
//        linkListNew.print(linkList);
//
//        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkList =   linkListNew.LRU(linkList,"1");
//        linkListNew.print(linkList);
//
//        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkList =   linkListNew.LRU(linkList,"6");
//        linkListNew.print(linkList);
//        System.out.println("linkList<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkListNew.print(linkList);
//              System.out.println("reverse<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkListNew.print(linkListNew.reverse(linkList));
//        System.out.println("linkList<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkListNew.print(linkList);
//
//       //linkList.getNext().getNext().setNext(linkList);  //形成环
//        System.out.println("checkIsRing<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(linkListNew.checkIsRing(linkList));

//               linkList.getNext().getNext().setNext(linkList);  //形成环
//        System.out.println("checkIsRingN<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(linkListNew.checkIsRingN(linkList));


//        System.out.println("linkList<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//
//        Node node11 = new Node();
//        node1.setData("1");
//        Node node22 = new Node();
//        node2.setData("2");
//        // node1.setNext(node2);
//        Node node33 = new Node();
//        node3.setData("2");
//        //  node2.setNext(node3);
//        // node1.print(node1);
//        Node node44 = new Node();
//        node4.setData("2");
//        Node linkList1=new Node();
//        LinkList linkListNew1 = new LinkList();
//        linkList1 = linkListNew1.add(linkList1, node1);
//        linkList1 = linkListNew1.add(linkList1, node2);
//        linkList1 = linkListNew1.add(linkList1, node3);
//        linkList1 = linkListNew1.add(linkList1, node4);
//        linkListNew.print(linkList);
//        linkListNew.print(linkList1);
//
//        System.out.println("merge<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkListNew.print(linkListNew.merge(linkList,linkList1));
//        System.out.println("deleteDescN<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        linkListNew.print(linkListNew.deleteDescN(linkList,5));
//
//        System.out.println("getCenterNode<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(linkListNew.getCenterNode(linkList));

    }


}
