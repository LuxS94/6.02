package org.example._02.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utenti")
public class Utente {
    @Id
    private String username;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;

    public Utente() {
    }

    ;

    public Utente(String username, String nome, String email) {
        this.username = username;
        this.nome = nome;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "username='" + username + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
