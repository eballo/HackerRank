package com.hackerrank.thirtydaysofcode;


import java.util.Scanner;

public class Day22 {

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }


    public static int getHeight(Node root){
        int left = 0, right = 0;

        if(root!=null){
            right = getHeight(root.right);
            left = getHeight(root.left);
            return Math.max(left, right) + 1;
        }else{
            return -1;
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
