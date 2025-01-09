package Esercizio1;

public class Rettangolo {

        private int altezza;
        private int larghezza;

        public Rettangolo(int altezza, int larghezza) {
            this.altezza = altezza;
            this.larghezza = larghezza;
        }
        public int calcolaPerimetro (){
            return (altezza+larghezza)*2;
        };
        public int calcolaArea (){
            return larghezza*altezza;
        };
        public void stampaRettangolo () {
            System.out.println("area:" + calcolaArea());
            System.out.println("perimetro:" + calcolaPerimetro());
        }

        public void stampaDueRettangoli (Rettangolo r1, Rettangolo r2){
                System.out.println("Rettangolo 1:");
                System.out.println("area:" + r1.calcolaArea());
                System.out.println("perimetro:" + r1.calcolaPerimetro());


                System.out.println("Rettangolo 2:");
                System.out.println("Area: " + r2.calcolaArea());
                System.out.println("Perimetro: " + r2.calcolaPerimetro());
                int sommaAree = r1.calcolaArea() + r2.calcolaArea();
                int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
                System.out.println("Somma delle aree: " + sommaAree);
                System.out.println("Somma dei perimetri: " + sommaPerimetri);
        }
        };

