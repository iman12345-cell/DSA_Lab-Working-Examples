/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.node;

/**
 *
 * @author 123
 */

class Node
{
    int data;
    Node address;

public Node(int data){
this.data=data;
this.address=null;
        } }
public class linkedlist {
public static void main(String[] args) {
        Node Node1=new Node(1);
        Node Node2=new Node(2);
        Node Node3=new Node(3);
        Node Node4=new Node(4);
        
        Node1.address=Node2;
        Node2.address=Node3;
        Node3.address=Node4;
        Node1.address=null;
        
        System.out.println(Node1.data);
        System.out.println(Node2.data);
        System.out.println(Node3.data);
        System.out.println(Node4.data);
}}
