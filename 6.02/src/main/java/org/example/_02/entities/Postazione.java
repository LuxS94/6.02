package org.example._02.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Postazioni")
public class Postazione {
    @id
    private long id;
    private String descrizione;
    private Tipo_postazione tipo;
    private int occupantiMax;
    @ManyToOne
    @JoinColumn
    private long edificio;

    public Postazione() {
    }

    ;

    public Postazione(long id, String descrizione, Tipo_postazione tipo, int occupantiMax, long edificio) {
        this.id = id;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.occupantiMax = occupantiMax;
        this.edificio = edificio;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Tipo_postazione getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_postazione tipo) {
        this.tipo = tipo;
    }

    public int getOccupantiMax() {
        return occupantiMax;
    }

    public void setOccupantiMax(int occupantiMax) {
        this.occupantiMax = occupantiMax;
    }

    public long getEdificio() {
        return edificio;
    }

    public void setEdificio(long edificio) {
        this.edificio = edificio;
    }
}
