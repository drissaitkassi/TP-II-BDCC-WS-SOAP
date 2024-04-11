package com.akdriss.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebService(serviceName = "BnqueWS")
public class BanqueService {


    @WebMethod(operationName = "convertEuroToDH")
    public double convertion(@WebParam(name = "montant") double mnt){
        return mnt*11;
    }


    public Compte getCompte(@WebParam(name = "code") int conde){
        return new Compte(1,2000.0,new Date());
    }

    public List<Compte> getAll(){


        return Stream.of(new Compte(1,2000.0,new Date()),
                new Compte(2,3000.0,new Date()),
                new Compte(3,4000.0,new Date()),
                new Compte(5,4000.0,new Date())).collect(Collectors.toList());

    }

}
