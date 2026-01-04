package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.ws.BankAccountService;

public class serverJWS {
    public static void main(String[]args){
        String url = "http://localhost:8686/";
        Endpoint.publish(url , new BankAccountService());
        System.out.println("Bank Account Service is Published Successfully"+url);
    }
}
