package org.example._02.services;

import org.example._02.entities.Postazione;
import org.example._02.entities.Tipo_postazione;
import org.example._02.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    private final PostazioneRepository PR;

    @Autowired
    public PostazioneService(PostazioneRepository PR) {
        this.PR = PR;
    }

    public void savePostazione(Postazione postazione) {
        PR.save(postazione);
        System.out.println("Postazione " + postazione.getId() + " salvata con successo!");
    }

    public List<Postazione> cercaPerTipoEcitta(Tipo_postazione tipo, String citta) {
        List<Postazione> lista = PR.findByTipoAndEdificio_Citta(tipo, citta);
        System.out.println(lista);
        return lista;
    }

    ;
}

