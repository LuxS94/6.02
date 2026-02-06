package repository;

import org.example._02.entities.Postazione;
import org.example._02.entities.Prenotazione;
import org.example._02.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByDataAndPostazione(Date data, Postazione postazione);

    boolean existsByDataAndUtente(Date data, Utente utente);
}
