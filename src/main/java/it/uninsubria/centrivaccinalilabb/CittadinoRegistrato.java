package it.uninsubria.centrivaccinalilabb;

import java.util.Date;

public class CittadinoRegistrato extends CittadinoVaccinato{
    private String email;
    private String username;
    private String password;

    CittadinoRegistrato(String nome, String cognome, String nomeCV, String cf, Date data, String nomeV, int id, String email, String username, String password) {
        super(nome, cognome, nomeCV, cf, data, nomeV, id);
        this.email = email;
        this.username= username;
        this.password = password;
    }


}
