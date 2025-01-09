package Esercizio2;

public class SIM {
    private String telephoneNumber;
    private double creditEuro;
    private Call[] lastFiveCall;

    // Costruttore che inizializza la SIM con numero di telefono e credito 0
    public SIM(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.creditEuro = 0.0;
        this.lastFiveCall = new Call[5];
    }

    // Metodo per stampare i dati della SIM (numero di telefono, credito, ultime chiamate)
    public void stampaDatiSIM() {
        System.out.println("telephoneNumber: " + this.telephoneNumber);
        System.out.println("credit: " + this.creditEuro);
        System.out.println("Lista chiamate:");
        for (int i = 0; i < this.lastFiveCall.length; i++) {
            if (this.lastFiveCall[i] != null) {
                System.out.println(this.lastFiveCall[i]);
            }
        }
    }

    // Metodo per effettuare una chiamata
    public void effettuaChiamata(Call c) {
        // Aggiungiamo la chiamata alla lista delle ultime 5 chiamate
        for (int i = 0; i < this.lastFiveCall.length; i++) {
            if (this.lastFiveCall[i] == null) {
                // Se c'è uno spazio vuoto, aggiungi la chiamata
                this.lastFiveCall[i] = c;
                return;
            }
        }

        // Se l'array è pieno, shiftiamo le chiamate esistenti e aggiungiamo la nuova
        for (int i = 0; i < this.lastFiveCall.length - 1; i++) {
            this.lastFiveCall[i] = this.lastFiveCall[i + 1];
        }

        // Aggiungiamo la nuova chiamata alla posizione finale
        this.lastFiveCall[this.lastFiveCall.length - 1] = c;
    }

    // Metodo per aggiungere credito alla SIM
    public void aggiungiCredito(double importo) {
        this.creditEuro += importo;
    }
}
