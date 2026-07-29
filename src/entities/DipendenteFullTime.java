package entities;

public class DipendenteFullTime extends Dipendente {
    private static final double BONUS_PER_ANNO = 2.00;
    private final int anniAnzianita;

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int anniAnzianita) {
        super(matricola, stipendio, dipartimento);
        this.anniAnzianita = anniAnzianita;
    }

    public int getAnniAnzianita() {
        return anniAnzianita;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + BONUS_PER_ANNO * anniAnzianita;
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "matricola=" + getMatricola() +
                ", stipendio=" + getStipendio() +
                ", dipartimento=" + getDipartimento() +
                ", anniAnzianita=" + anniAnzianita +
                '}';
    }
}
