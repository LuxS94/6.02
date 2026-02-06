package org.example._02.repository;

import org.example._02.entities.Postazione;
import org.example._02.entities.Prenotazione;
import org.example._02.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByDataAndPostazione(LocalDate data, Postazione postazione);

    boolean existsByDataAndUtente(LocalDate data, Utente utente);
}
