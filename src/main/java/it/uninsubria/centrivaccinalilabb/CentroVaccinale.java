package it.uninsubria.centrivaccinalilabb;

public class CentroVaccinale {
    private String nome;
    private String nomeVia;
    private int numeroCivico;
    private String comune;
    private String provincia;
    private int cap;

    CentroVaccinale(String nome, String via, int numeroCivico, String comune, String provincia, int cap){
        this.nome = nome;
        this.nomeVia = via;
        this.numeroCivico = numeroCivico;
        this.comune = comune;
        this.provincia = provincia;
        this.cap = cap;
    }
}
