package soa.tp1.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "ConvertisseurMonnaieService")
public class ConvertisseurMonnaie {

    private static final double TAUX_EURO = 0.30; // 1 Dinar = 0.30 Euro
    private static final double TAUX_DINAR = 1 / TAUX_EURO;

    public ConvertisseurMonnaie() {}

    @WebMethod(operationName = "dinarToEuro")
    public double dinarToEuro(double dinar) {
        return dinar * TAUX_EURO;
    }

    @WebMethod(operationName = "euroToDinar")
    public double euroToDinar(double euro) {
        return euro * TAUX_DINAR;
    }
}
