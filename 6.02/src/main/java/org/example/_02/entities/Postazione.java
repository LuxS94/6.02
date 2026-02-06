package org.example._02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Postazioni")
public class Postazione {
    @Id
    @GeneratedValue
    private long id;
    private String descrizione;
    @Column(nullable = false)
    private Tipo_postazione tipo;
    private int occupantiMax;
    @ManyToOne
    @JoinColumn
    private Edificio edificio;

    public Postazione() {
    }

    ;

    public Postazione(String descrizione, Tipo_postazione tipo, int occupantiMax, Edificio edificio) {
        this.id = id;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.occupantiMax = occupantiMax;
        this.edificio = edificio;
    }

    public long getId() {
        return id;
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

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}
