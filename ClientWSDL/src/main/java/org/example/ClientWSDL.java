package org.example;

import proxy.BankAccountService;
import proxy.BankWS;

public class ClientWSDL {
    public static void main(String[] args){
        BankAccountService proxyWs = new BankWS().getBankAccountServicePort();
        System.out.println(proxyWs.conversionEuroToDh(3500));
    }
}
