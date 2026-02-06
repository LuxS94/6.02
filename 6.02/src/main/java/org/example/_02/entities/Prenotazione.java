package org.example._02.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn
    private Utente utente;
    private Date data;
    @OneToOne
    @JoinColumn
    private Postazione postazione;

    public Prenotazione() {
    }

    ;

    public Prenotazione(long id, Utente utente, Date data, Postazione postazione) {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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
