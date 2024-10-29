package tn.iteam;

import jakarta.xml.ws.Endpoint;
import tn.iteam.service.BanqueService;

public class ServerJaxWS {
    public static void main(String[] args) {
        // declaration de l'url
        String url = "http://localhost:8085/BanqueService";
        //creation d'une instance du service
        BanqueService webService = new BanqueService();
        //publier le ws
        Endpoint.publish(url, webService);
        System.out.println("SOAP service started on "+url);
    }
}
