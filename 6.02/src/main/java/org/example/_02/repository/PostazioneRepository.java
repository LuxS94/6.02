package org.example._02.repository;

import org.example._02.entities.Postazione;
import org.example._02.entities.Tipo_postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(Tipo_postazione tipo, String citta);
}
