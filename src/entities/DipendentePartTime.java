package entities;

public class DipendentePartTime extends Dipendente {
    private final int oreContratto;
    private final double tariffaOraria;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, int oreContratto, double tariffaOraria) {
        super(matricola, oreContratto * tariffaOraria, dipartimento);
        this.oreContratto = oreContratto;
        this.tariffaOraria = tariffaOraria;
    }

    public int getOreContratto() {
        return oreContratto;
    }

    public double getTariffaOraria() {
        return tariffaOraria;
    }

    @Override
    public double calcolaStipendio() {
        return oreContratto * tariffaOraria;
    }

    @Override
    public String toString() {
        return "DipendentePartTime{" +
                "matricola=" + getMatricola() +
                ", dipartimento=" + getDipartimento() +
                ", oreContratto=" + oreContratto +
                ", tariffaOraria=" + tariffaOraria +
                '}';
    }
}
