package com.akdriss.ws;

import javax.xml.ws.Endpoint;


public class ServerJWS {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:5555/",new BanqueService());
        System.out.println("ws up and runing .....");
    }


}
