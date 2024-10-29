package tn.iteam.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import tn.iteam.metier.Compte;
import java.util.Date;
import java.util.List;

@WebService()
public class BanqueService {

    @WebMethod(operationName = "conversionFromEuroToDt")
    public double conversion(@WebParam(name = "montane") double mt ){
        return mt*3.5;
    }

    @WebMethod(operationName = "getAccountById")
    public Compte getCompteById(@WebParam(name = "accountID") int id ){
        return new Compte(id,Math.random()*90000,new Date());
    }

    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1L,Math.random()*90000,new Date()),
                new Compte(2L,Math.random()*90000,new Date()),
                new Compte(4L,Math.random()*90000,new Date()),
                new Compte(5L,Math.random()*90000,new Date())
        );
    }
}
