package it.uninsubria.centrivaccinalilabb;

public class CentroVaccinale {
    private String nome;
    private String indirizzo; //nome via, numero civico, sigla provincia
    private String comune;
    private int cap;

    CentroVaccinale(String nome, String indirizzo,  String comune, String provincia, int cap){
        this.nome = nome;
        this.comune = comune;
        this.cap = cap;
    }
}
