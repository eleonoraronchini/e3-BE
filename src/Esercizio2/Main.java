package Esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM s1 = new SIM("340405036");
        s1.aggiungiCredito(10);
        Call c1 = new Call(2.6, "3317115879");
        s1.effettuaChiamata(c1);
        s1.effettuaChiamata(new Call(3.4, "32050674"));
        s1.stampaDatiSIM();
    }
}
