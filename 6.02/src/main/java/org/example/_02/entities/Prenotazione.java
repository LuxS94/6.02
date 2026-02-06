package org.example._02.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn
    private Utente utente;
    private LocalDate data;
    @OneToOne
    @JoinColumn
    private Postazione postazione;

    public Prenotazione() {
    }

    ;

    public Prenotazione(Utente utente, LocalDate data, Postazione postazione) {
        this.id = id;
        this.utente = utente;
        this.data = data;
        this.postazione = postazione;
    }

    public long getId() {
        return id;
    }


    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", utente=" + utente +
                ", data=" + data +
                ", postazione=" + postazione +
                '}';
    }
}
