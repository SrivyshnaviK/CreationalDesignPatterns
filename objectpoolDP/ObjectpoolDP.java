package com.Vyshnavi.objectpoolDP;

public class ObjectpoolDP {
    public static void main(String[] args) {
        Client client1=new Client();
        Client client2=new Client();
        Client client3=new Client();
        System.out.println("MaxPool Size of 2...Request of 3 clients");
        System.out.println("Client 1:"+client1.getObject());
        System.out.println("Client 2:"+client2.getObject());
        System.out.println("Client 3:"+client3.getObject());
        System.out.println("After an instance is released..");
        //client1.releaseObject();
        System.out.println("Client 3:"+client3.getObject());
    }
}
