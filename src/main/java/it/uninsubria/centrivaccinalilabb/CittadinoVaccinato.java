package it.uninsubria.centrivaccinalilabb;

import java.util.Date;

public class CittadinoVaccinato {
    private String nome;
    private String cognome;
    private String nomeCV;
    private String cf;
    private Date dataVaccinazione;
    private String nomeVaccino;
    private int idUnivoco;

    CittadinoVaccinato(String nome, String cognome, String nomeCV, String cf, Date data, String nomeV, int id){
        this.nome=nome;
        this.cognome=cognome;
        this.nomeCV=nomeCV;
        this.cf=cf;
        this.dataVaccinazione=data;
        this.nomeVaccino=nomeV;
        this.idUnivoco=id;
    }
}
