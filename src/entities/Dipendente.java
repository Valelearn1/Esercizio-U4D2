package entities;

public class Dipendente {
    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    // Costruttori
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
        // assegna al campo dipartimento di questo oggetto (this.dipartimento)
        // il valore ricevuto come parametro (dipartimento)
    }

    public double calcolaStipendio() {
        return stipendio;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}

