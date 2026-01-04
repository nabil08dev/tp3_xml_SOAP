package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BankWS")
public class BankAccountService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double conversionToDh(@WebParam(name = "montant") double amount){
        return amount*11;
    }
    @WebMethod
    public Account getAccount(@WebParam(name="code") int code){
    return new Account(code , 43000,new Date());
    }
    @WebMethod
    public List<Account> listAccount(){
        return List.of(
                new Account(1,43000, new Date()),
                new Account(2,55000, new Date()),
                new Account(3,46000, new Date())

        );
    }
}
