package Esercizio2;

public class Call {
    private double minutes;
    private String callNumber;

    public Call (double minutes, String callNumber){
        this.minutes = minutes;
        this.callNumber = callNumber;
    }
    public void infoCall (){
        System.out.println("Chiamata:" + this.callNumber + "Durata:" + this.minutes);
    }
}
