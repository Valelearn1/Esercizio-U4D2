package entities;

public class Dirigente extends Dipendente {
    private static final double BONUS_PER_DIPENDENTE = 100.80;
    private final int numeroDipendentiGestiti;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, int numeroDipendentiGestiti) {
        super(matricola, stipendio, dipartimento);
        this.numeroDipendentiGestiti = numeroDipendentiGestiti;
    }

    public int getNumeroDipendentiGestiti() {
        return numeroDipendentiGestiti;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + BONUS_PER_DIPENDENTE * numeroDipendentiGestiti;
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "matricola=" + getMatricola() +
                ", stipendio=" + getStipendio() +
                ", dipartimento=" + getDipartimento() +
                ", numeroDipendentiGestiti=" + numeroDipendentiGestiti +
                '}';
    }
}
