import entities.*;

public class Main {
    public static void main(String[] args) {
        Dipendente persona1 = new Dipendente("1234", 1499.90, Dipartimento.PRODUZIONE);
        Dipendente persona2 = new Dipendente("5678", 1699.90, Dipartimento.AMMINISTRAZIONE);
        Dipendente persona3 = new Dipendente("9876", 2000.90, Dipartimento.VENDITE);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        DipendenteFullTime fullTime = new DipendenteFullTime("1357", 1700.90, Dipartimento.PRODUZIONE, 5);
        DipendentePartTime partTime = new DipendentePartTime("2468", Dipartimento.VENDITE, 20, 15.0);
        Dirigente dirigente = new Dirigente("0864", 3500.00, Dipartimento.AMMINISTRAZIONE, 8);

        System.out.println("Stipendio full time: " + fullTime.calcolaStipendio());
        System.out.println("Stipendio part time: " + partTime.calcolaStipendio());
        System.out.println("Stipendio dirigente: " + dirigente.calcolaStipendio());
    }
}
